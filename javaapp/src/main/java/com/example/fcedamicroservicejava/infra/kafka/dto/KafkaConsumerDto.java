package com.example.fcedamicroservicejava.infra.kafka.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

@Getter
@Setter
public class KafkaConsumerDto {

    @JsonAlias("Name")
    private String name;
    @JsonAlias("Payload")
    private LinkedHashMap<String, Object> payload;
}
