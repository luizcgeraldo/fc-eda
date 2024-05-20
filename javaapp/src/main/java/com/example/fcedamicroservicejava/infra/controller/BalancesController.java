package com.example.fcedamicroservicejava.infra.controller;

import com.example.fcedamicroservicejava.infra.controller.dto.BalancesOutputDto;
import com.example.fcedamicroservicejava.infra.repository.BalancesEntity;
import com.example.fcedamicroservicejava.infra.repository.BalancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/balances", produces = MediaType.APPLICATION_JSON_VALUE)
public class BalancesController {

    @Autowired
    private BalancesRepository balancesRepository;

    @GetMapping("/{account_id}")
    public ResponseEntity createFund(@PathVariable(name = "account_id") String accountId) {

        Optional<BalancesEntity> result = balancesRepository.findById(accountId);
        if(result.isPresent()){
            BalancesOutputDto balancesOutputDto = new BalancesOutputDto();
            balancesOutputDto.setAccountId(result.get().getAccountId());
            balancesOutputDto.setBalance(result.get().getBalance());
            balancesOutputDto.setCreatedAt(result.get().getCreatedAt());
            balancesOutputDto.setUpdatedAt(result.get().getUpdatedAt());
            return new ResponseEntity<>(balancesOutputDto, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Account with ID "+accountId+" was not found", HttpStatus.BAD_REQUEST);
        }


    }
}
