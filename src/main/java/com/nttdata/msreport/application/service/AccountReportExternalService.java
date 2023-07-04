package com.nttdata.msreport.application.service;

import com.nttdata.msreport.application.dto.response.ObjectResponse;
import io.reactivex.rxjava3.core.Flowable;

public interface AccountReportExternalService {

  Flowable<ObjectResponse> summaryAccounts(String clientId);

}
