package com.dio.santander.banklineapi.service;


import com.dio.santander.banklineapi.models.Conta;

import java.util.List;

public interface ContaService {

    List<Conta> all();

    Conta save(Conta conta);

    Conta findIdCorrentista(long idConta);

}
