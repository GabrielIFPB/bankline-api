package com.dio.santander.banklineapi.models;

import com.dio.santander.banklineapi.emuns.MovimentacaoTipo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private double valor;

    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo tipo;

    @Column(name = "id_conta")
    private long idConta;

    public Movimentacao() {
        this.setDataHora(LocalDateTime.now());
    }

    public Movimentacao(LocalDateTime dataHora, String descricao, double valor, MovimentacaoTipo tipo, long idConta) {
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.idConta = idConta;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }

    public long getConta() {
        return this.idConta;
    }

    public void setConta(long conta) {
        this.idConta = conta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movimentacao that = (Movimentacao) o;

        if (id != that.id) return false;
        if (Double.compare(that.valor, valor) != 0) return false;
        if (this.idConta != that.idConta) return false;
        if (!Objects.equals(dataHora, that.dataHora)) return false;
        if (!Objects.equals(descricao, that.descricao)) return false;
        return tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (dataHora != null ? dataHora.hashCode() : 0);
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        temp = Double.doubleToLongBits(valor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        result = (int) (31 * result + this.idConta);
        return result;
    }
}
