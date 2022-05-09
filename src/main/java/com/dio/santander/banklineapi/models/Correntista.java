package com.dio.santander.banklineapi.models;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "correntista")
public class Correntista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cpf", length = 16)
    private String cpf;

    @Column(name = "nome", length = 60)
    private String nome;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Conta> contas;

    public Correntista() { }

    public Correntista(long id, String cpf, String nome, List<Conta> contas) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.contas = contas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getConta() {
        return this.contas;
    }

    public void setConta(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Correntista that = (Correntista) o;

        if (id != that.id) return false;
        if (!cpf.equals(that.cpf)) return false;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + cpf.hashCode();
        result = 31 * result + nome.hashCode();
        return result;
    }
}
