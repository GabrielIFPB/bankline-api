package com.dio.santander.banklineapi.service;


import com.dio.santander.banklineapi.models.Conta;

public interface ContaService {

    Conta save(Conta conta);

    Conta findIdCorrentista(long idConta);

}
