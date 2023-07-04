package com.nttdata.msreport.domain.service;

import com.nttdata.msreport.domain.model.Account;
import com.nttdata.msreport.domain.model.AccountSummary;
import io.reactivex.rxjava3.core.Flowable;

public interface AccountService {

  Flowable<Account> findAllAccounts(String clientId);

  Flowable<AccountSummary> summaryAccounts(String clientId);

}
