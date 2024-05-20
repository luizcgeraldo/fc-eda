package com.example.fcedamicroservicejava.infra.kafka;

import com.example.fcedamicroservicejava.infra.kafka.dto.BalancesConsumerKafkaDto;
import com.example.fcedamicroservicejava.infra.kafka.dto.KafkaConsumerDto;
import com.example.fcedamicroservicejava.infra.repository.BalancesEntity;
import com.example.fcedamicroservicejava.infra.repository.BalancesRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.DataInput;
import java.io.IOException;
import java.util.Date;

@Service
public class ConsumerKafka {

    @Autowired
    private BalancesRepository balancesRepository;

    @KafkaListener(topics = "transactions", groupId = "transaction")
    public void consumeMessageTransactions(String message) {
        System.out.println("KAFKA TRANSACTION "+ message);
    }

    @KafkaListener(topics = "balances", groupId = "balance")
    public void consumeMessageBalances(String message) throws IOException {
        System.out.println("KAFKA BALANCE "+ message);
        ObjectMapper objectMapper = new ObjectMapper();


        KafkaConsumerDto kafkaConsumerDto = objectMapper.readValue(message, KafkaConsumerDto.class);
        BalancesConsumerKafkaDto balances = new BalancesConsumerKafkaDto();
        balances.setBalanceAccountTo((Integer) kafkaConsumerDto.getPayload().get("balance_account_id_to"));
        balances.setBalanceAccountFrom((Integer) kafkaConsumerDto.getPayload().get("balance_account_id_from"));
        balances.setAccountIdTo((String) kafkaConsumerDto.getPayload().get("account_id_to"));
        balances.setAccountIdFrom((String) kafkaConsumerDto.getPayload().get("account_id_from"));

        BalancesEntity balancesEntityFrom = new BalancesEntity();
        balancesEntityFrom.setBalance(balances.getBalanceAccountFrom());
        balancesEntityFrom.setAccountId(balances.getAccountIdFrom());
        balancesEntityFrom.setUpdatedAt(new Date());
        balancesRepository.save(balancesEntityFrom);
        BalancesEntity balancesEntityTo = new BalancesEntity();
        balancesEntityTo.setBalance(balances.getBalanceAccountTo());
        balancesEntityTo.setAccountId(balances.getAccountIdTo());
        balancesEntityTo.setUpdatedAt(new Date());
        balancesRepository.save(balancesEntityTo);

    }
}
