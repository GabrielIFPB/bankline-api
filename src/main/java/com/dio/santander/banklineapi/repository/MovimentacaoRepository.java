package com.dio.santander.banklineapi.repository;

import com.dio.santander.banklineapi.models.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
