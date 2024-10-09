package com.PSII.appproduto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PSII.appproduto.model.Produto;
import com.PSII.appproduto.repository.ProdutoRepository;




@Controller
@RequestMapping("/")
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("produto",new Produto());
        return "index.html";
    }
    

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Produto produto){
        produtoRepository.save(produto);
        return "redirect:/index.html";
    }
    
}
