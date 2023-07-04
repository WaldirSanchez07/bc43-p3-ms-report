package com.nttdata.msreport.domain.repository;

import com.nttdata.msreport.domain.model.Card;
import io.reactivex.rxjava3.core.Maybe;

public interface CardRepository {

  Maybe<Card> findById(String id);

}
