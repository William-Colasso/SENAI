package com.psii.appprodutopedido.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psii.appprodutopedido.model.*;

import com.psii.appprodutopedido.repository.*;

@Controller
@RequestMapping("/pedido")
public class PedidoController {
    

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoRepository produtoRepository

    @GetMapping("/pedido")
    public String listarPedidos(Model model) {
        model.addAttribute("pedidos", pedidoRepository.findAll());
        model.addAttribute("produtos", produtoRepository.findAll());
        return "index";
    }
    

    @PostMapping("/savePedido")
    public String saveProduct(@ModelAttribute Pedido pedido){
        pedidoRepository.save(pedido);
        return "redirect:/index.html";
    }
}
