package com.PSII.appproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PSII.appproduto.model.Pedido;

import com.PSII.appproduto.repository.PedidoRepository;

@Controller
@RequestMapping("/")
public class PedidoController {
    

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/pedido")
    public String showForm(Model model) {
        model.addAttribute("pedido",new Pedido());
        return "index.html";
    }
    

    @PostMapping("/savePedido")
    public String saveProduct(@ModelAttribute Pedido pedido){
        pedidoRepository.save(pedido);
        return "redirect:/index.html";
    }
}
