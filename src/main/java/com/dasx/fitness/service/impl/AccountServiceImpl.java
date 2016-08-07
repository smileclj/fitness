package com.dasx.fitness.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dasx.fitness.common.enums.ErrorCode;
import com.dasx.fitness.common.exceptions.FitnessException;
import com.dasx.fitness.entity.Account;
import com.dasx.fitness.entity.AccountExample;
import com.dasx.fitness.entity.AccountExample.Criteria;
import com.dasx.fitness.mapper.AccountMapperExt;
import com.dasx.fitness.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private AccountMapperExt accountMapperExt;

    @Override
    public Account login(String accountName, String pwd) {
        AccountExample e_ac = new AccountExample();
        Criteria c_ac = e_ac.createCriteria();
        c_ac.andAccountNameEqualTo(accountName);
        c_ac.andPwdEqualTo(pwd);
        List<Account> accounts = accountMapperExt.selectByExample(e_ac);
        if (accounts.size() < 1) {
            throw new FitnessException(ErrorCode.ERROR_LOGIN, new String[]{"用户名"}, new String[]{accountName});
        }
        Account account = accounts.get(0);
        refreshLoginTime(account);
        return account;
    }

    @Transactional
    private void refreshLoginTime(Account account) {
        account.setLoginTime(new Date());
        int r = accountMapperExt.updateByPrimaryKeySelective(account);
        if (r < 1) {
            throw new FitnessException(ErrorCode.ERROR_DATA);
        }
    }
}
