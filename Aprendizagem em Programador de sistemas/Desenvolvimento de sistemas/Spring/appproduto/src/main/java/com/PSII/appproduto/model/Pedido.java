package com.PSII.appproduto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataPedido;
    private Long idProduto;

    // Getters

    public Long getId() {
        return id;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

}
