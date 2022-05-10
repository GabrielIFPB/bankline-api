package com.dio.santander.banklineapi.repository;

import com.dio.santander.banklineapi.models.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Long> {
}
