package com.psii.appprodutopedido.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private LocalDate dataPedido;
    
    @ManyToOne
    @JoinColumn(name = "produto_id")



    // Getters

    public Long getId() {
        return id;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    

}
