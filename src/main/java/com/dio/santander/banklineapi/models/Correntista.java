package com.dio.santander.banklineapi.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "correntista")
public class Correntista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;

    @NotNull
    @Column(name = "cpf", length = 16, nullable = false, unique = true)
    private String cpf;

    @Column(name = "nome", length = 60, nullable = false, unique = true)
    private String nome;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_correntista")
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
