package com.nttdata.msreport.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  private String id;
  private String accountNumber;
  private String clientId;
  private String passiveProductId;
  private String activeProductId;

}
