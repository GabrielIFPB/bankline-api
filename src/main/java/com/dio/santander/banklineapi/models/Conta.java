package com.dio.santander.banklineapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {

    @Id
    private long numero;

    @Column(name = "saldo")
    private double saldo;

    public Conta() { }
    public Conta(long numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;

        if (numero != conta.numero) return false;
        return Double.compare(conta.saldo, saldo) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (numero ^ (numero >>> 32));
        temp = Double.doubleToLongBits(saldo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
