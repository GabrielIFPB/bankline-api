package com.dio.santander.banklineapi.controllers;

import com.dio.santander.banklineapi.models.Conta;
import com.dio.santander.banklineapi.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void save(@RequestBody Conta conta) {

    }
}

