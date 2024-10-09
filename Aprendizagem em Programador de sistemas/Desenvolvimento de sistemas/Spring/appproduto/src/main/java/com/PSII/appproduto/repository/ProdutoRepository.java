package com.PSII.appproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PSII.appproduto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
    
}
