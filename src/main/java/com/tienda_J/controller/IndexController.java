package com.tienda_J.controller;


import com.tienda_J.service.ArticuloService;
import com.tienda_J.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ArticuloService articuloService;
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        
        var articulos = articuloService.getArticulos(true);
        model.addAttribute("articulos", articulos);
        
        return "index";
    } 
}
