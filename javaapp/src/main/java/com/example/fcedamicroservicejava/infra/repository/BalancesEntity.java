package com.example.fcedamicroservicejava.infra.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.Date;


@Getter
@Setter
@ToString
@Entity
@Table(name = "balances")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class BalancesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private String accountId;
    @Column(name = "balance")
    private Integer balance;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;
}
