package br.com.fiap.challengesprint3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;


@Entity
public class Produto {

    @Id
    @GeneratedValue
    Long id;
    String nome;
    String categoria;
    BigDecimal vlUnitario;

    public Produto() {
    }

    public Produto(String nome, String categoria, BigDecimal vlUnitario) {
        this.nome = nome;
        this.categoria = categoria;
        this.vlUnitario = vlUnitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(BigDecimal vlUnitario) {
        this.vlUnitario = vlUnitario;
    }
}
