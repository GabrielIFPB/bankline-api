package com.dio.santander.banklineapi.controllers;

import com.dio.santander.banklineapi.exception.CorrentistaNotFoundException;
import com.dio.santander.banklineapi.models.Conta;
import com.dio.santander.banklineapi.models.Correntista;
import com.dio.santander.banklineapi.service.CorrentistaServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Correntista findById(@PathVariable("id") long id) {
        try {
            return this.serviceImplements.findById(id);
        } catch (CorrentistaNotFoundException e) {
            throw new CorrentistaNotFoundException(
                    String.format("Correntista: %d não encontrado", id)
            );
        }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Correntista save(@Valid @RequestBody Correntista correntista) {
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
