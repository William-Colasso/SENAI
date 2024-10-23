package com.psii.app_cad_pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;
import java.io.IOException;
import com.psii.app_cad_pro.model.Produto;
import com.psii.app_cad_pro.service.ProdutoService;

@Controller
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;


    @GetMapping("/cadastrar")
    public String mostrarFormularioCadastro(Model model){
        model.addAttribute("produto", new Produto());
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarProduto(Produto produto, MultipartFile file) throws IOException{
        if(!file.isEmpty()){
            produto.setImagemBytes(file.getBytes());
        }
        produtoService.salvarProduto(produto);
        return "redirect:/listar";
    }

    @GetMapping("/listar")
    public String listarProdutos(Model model){
        model.addAttribute("produto",produtoService.listarProduto());
        return "listar";
    }

    @GetMapping("/produto/imagem/{id}")
    public ResponseEntity<byte[]> obterImagemProduto(@PathVariable Long id){
        Produto produto = produtoService.buscarPorId(id);
        byte[] imagem = produto.getImagemBytes();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);

        return new ResponseEntity<>(imagem, headers, HttpStatus.OK);

    }

    @PostMapping("/produto/editar/{id}")
    public String deletarProduto(@PathVariable Long id){
        produtoService.deletarPorId(id);

        return "redirect:/listar";
    }


    @GetMapping("/produto/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model){
        Produto produto = produtoService.buscarPorId(id);
        if(produto != null){
            model.addAttribute("produto", produto);
            return "editar_produto";
        }else{
            return "redirect:/produto/lista";
        }

    }



    @PostMapping("/produto/editar")
    public String editarProduto(@ModelAttribute Produto produto){
        produtoService.salvarProduto(produto);
        return "redirect:/listar";
    }


    @PostMapping("/produto/salvar")
    public String salvarProduto(@ModelAttribute Produto produto, @RequestParam("imagem") MultipartFile imagem){
        if(!imagem.isEmpty()){
            produto.setImagem(imagem);
        }
        produtoService.salvarProduto(produto);
        return "redirect:/listar";
    }
}
