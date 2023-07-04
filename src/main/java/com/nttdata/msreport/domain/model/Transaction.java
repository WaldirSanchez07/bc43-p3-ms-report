package com.nttdata.msreport.domain.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction {

  private String id;
  private String type;
  private String description;
  private String accountId;
  private String anotherAccountId;
  private Double amount;
  private LocalDateTime date;

}
