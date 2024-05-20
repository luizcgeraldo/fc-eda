package com.example.fcedamicroservicejava.infra.kafka.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;
import scala.Int;

@Getter
@Setter
public class BalancesConsumerKafkaDto {

    @JsonAlias("account_id_from")
    private String accountIdFrom;
    @JsonAlias("account_id_to")
    private String accountIdTo;
    @JsonAlias("balance_account_id_from")
    private Integer balanceAccountFrom;
    @JsonAlias("balance_account_id_to")
    private Integer balanceAccountTo;
}
