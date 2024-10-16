
package com.psii.appprodutopedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.psii.appprodutopedido.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
