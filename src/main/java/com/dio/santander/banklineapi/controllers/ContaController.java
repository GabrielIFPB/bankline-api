package com.dio.santander.banklineapi.controllers;

import com.dio.santander.banklineapi.models.Conta;
import com.dio.santander.banklineapi.repository.ContaRepository;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaRepository repository;

    @GetMapping
    public List<Conta> findAll() {
        return this.repository.findAll();
    }
}

