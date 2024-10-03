/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import model.Produto;
import java.util.*;

public interface ProdutoDao {
    void addProduto(Produto produto);
    Produto getProduto(int codigo);
    List<Produto> getAllProdutos();
    void updateProduto(Produto produto);
    void deleteProduto(int codigo);
}
