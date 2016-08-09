package com.dasx.fitness.controller.manage;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dasx.fitness.common.enums.ErrorCode;
import com.dasx.fitness.common.exceptions.FitnessException;
import com.dasx.fitness.common.resp.BaseResp;
import com.dasx.fitness.common.util.ValidateUtil;
import com.dasx.fitness.entity.Account;
import com.dasx.fitness.service.AccountService;

/**
 * Created by chenlj on 2016/8/7.
 */
@RestController
@RequestMapping("/sys")
public class SystemController {
    @Resource
    private AccountService accountService;

    @RequestMapping("login")
    public BaseResp<Integer> login(String accountName, String pwd, HttpServletRequest req) {
        if (!ValidateUtil.validate(accountName, pwd)) {
            throw new FitnessException(ErrorCode.ERROR_PARAM);
        }
        BaseResp<Integer> result = new BaseResp<>();
        Account account = accountService.login(accountName, pwd);
        req.getSession().setAttribute("login", account);
        return result;
    }

    @RequestMapping("exit")
    public BaseResp<Integer> exit(HttpServletRequest req) {
        BaseResp<Integer> result = new BaseResp<>();
        req.getSession().invalidate();
        return result;
    }
}
