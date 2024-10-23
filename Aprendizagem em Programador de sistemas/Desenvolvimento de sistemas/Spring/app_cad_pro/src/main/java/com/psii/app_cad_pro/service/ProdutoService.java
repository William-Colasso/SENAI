package com.psii.app_cad_pro.service;

import com.psii.app_cad_pro.model.Produto;
import com.psii.app_cad_pro.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import java.util.List;
@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto){
        return produtoRepository.save(produto);
    }
    public List<Produto>  listarProduto(){
        return produtoRepository.findAll();
    }
    public Produto buscarPorId(Long id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElseThrow(()-> new RuntimeException("Produto não encontrado"));
    }
    public void deletarPorId(Long id){
         produtoRepository.deleteById(id);
    }


}
