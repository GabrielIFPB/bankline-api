package com.dio.santander.banklineapi.service;

import com.dio.santander.banklineapi.models.Correntista;

import java.util.List;

public interface CorrentistaService {

    List<Correntista> all();

    Correntista save(Correntista correntista);

    Correntista update(Correntista correntista);

    void delete(Correntista correntista);
}
