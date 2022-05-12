package com.dio.santander.banklineapi.controllers;

import com.dio.santander.banklineapi.models.Conta;
import com.dio.santander.banklineapi.models.Correntista;
import com.dio.santander.banklineapi.service.CorrentistaServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

    @Autowired
    private CorrentistaServiceImplements serviceImplements;

    @GetMapping
    public List<Correntista> findAll() {
        return this.serviceImplements.all();
    }

    @PostMapping
    public Correntista save(@RequestBody Correntista correntista) {
        return this.serviceImplements.save(correntista);
    }

    @PutMapping
    public Correntista update(@RequestBody Correntista correntista) {
        return this.serviceImplements.update(correntista);
    }

    @DeleteMapping
    public void delete(@RequestBody Correntista correntista) {
        this.serviceImplements.delete(correntista);
    }
}
