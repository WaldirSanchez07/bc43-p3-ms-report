package com.nttdata.msreport.domain.service;

import com.nttdata.msreport.domain.model.Card;
import io.reactivex.rxjava3.core.Maybe;

public interface CardService {

  Maybe<Card> findById(String id);

}
