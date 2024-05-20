package com.example.fcedamicroservicejava.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalancesRepository extends JpaRepository<BalancesEntity, String> {
}
