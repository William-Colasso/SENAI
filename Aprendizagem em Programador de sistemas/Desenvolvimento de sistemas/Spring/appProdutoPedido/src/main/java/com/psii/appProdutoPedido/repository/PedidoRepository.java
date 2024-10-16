
package com.psii.appprodutopedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.psii.appprodutopedido.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido,Long> {
    
}
