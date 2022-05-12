package com.dio.santander.banklineapi.service;

import com.dio.santander.banklineapi.models.Correntista;
import com.dio.santander.banklineapi.repository.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorrentistaServiceImplements implements CorrentistaService {

    @Autowired
    private CorrentistaRepository repository;

    @Override
    public List<Correntista> all() {
        return this.repository.findAll();
    }

    @Override
    public Correntista save(Correntista correntista) {
        return this.repository.save(correntista);
    }

    @Override
    public Correntista update(Correntista correntista) {
        return this.repository.save(correntista);
    }

    @Override
    public void delete(Correntista correntista) {
        this.repository.delete(correntista);
    }
}
