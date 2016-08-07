package com.dasx.fitness.service;

import com.dasx.fitness.entity.Account;

public interface AccountService {
	Account login(String accountName, String pwd);
}
