package com.example.pruebaSH.controllers;

import com.example.pruebaSH.models.Producto;
import com.example.pruebaSH.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class ProductoController {
    @Autowired
    ProductoService productoService;

    @RequestMapping(value = "/")
    public String index(Model model){
        return "index";
    }
    @RequestMapping(value = "/productos")
    public String catalog(Model model){
        ArrayList<Producto> productos = productoService.obtenerProductos();
        model.addAttribute("productos",productos);

        return "productos";
    }
}
