package com.ifrn.cantina.controller;

import com.ifrn.cantina.model.Produto;
import com.ifrn.cantina.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/") 
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        model.addAttribute("produto", new Produto());
        return "produtos";
    }

    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute("produto") Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/"; 
    }
}