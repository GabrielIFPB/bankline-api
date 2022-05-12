package com.dio.santander.banklineapi.models;

import javax.persistence.*;

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "numero", nullable = false, unique = true)
    private long numero;

    @Column(name = "saldo", nullable = false)
    private double saldo;

    public Conta() {
        this.setSaldo(0.0);
    }

    public Conta(long numero, double saldo) {
        this.setNumero(numero);
        this.setSaldo(saldo);
    }

    public long getId() {
        return this.id;
    }

    public long getNumero() {
        return this.numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;

        if (this.id != conta.id) return false;
        if (this.numero != conta.numero) return false;
        return Double.compare(conta.saldo, this.saldo) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (numero ^ (numero >>> 32));
        temp = Double.doubleToLongBits(saldo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
