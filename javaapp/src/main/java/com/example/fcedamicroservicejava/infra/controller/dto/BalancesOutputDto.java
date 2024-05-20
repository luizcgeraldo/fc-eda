package com.example.fcedamicroservicejava.infra.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BalancesOutputDto {

    private String accountId;
    private Integer balance;
    private Date createdAt;
    private Date updatedAt;
}
