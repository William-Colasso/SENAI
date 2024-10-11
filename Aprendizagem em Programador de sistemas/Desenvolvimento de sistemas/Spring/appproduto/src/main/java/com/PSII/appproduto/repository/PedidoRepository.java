package com.PSII.appproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PSII.appproduto.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}
