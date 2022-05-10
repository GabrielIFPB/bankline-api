package com.dio.santander.banklineapi.repository;

import com.dio.santander.banklineapi.models.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> {
}
