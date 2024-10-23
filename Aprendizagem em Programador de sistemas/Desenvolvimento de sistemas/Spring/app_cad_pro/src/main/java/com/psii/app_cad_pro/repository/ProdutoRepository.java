package com.psii.app_cad_pro.repository;

import com.psii.app_cad_pro.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
