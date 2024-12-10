package com.example.pruebaSH.service;

import com.example.pruebaSH.models.Producto;
import com.example.pruebaSH.repositorios.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<Producto> obtenerProductos(){
        return (ArrayList<Producto>) productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Optional<Producto> obtenerPorId(Long id){
        return productoRepository.findById(id);
    }

    public Optional<Producto> obtenerPorCategoria(Long categoria){
        return productoRepository.findById(categoria);
    }

    public boolean eliminarProducto(long id){
        try{
            productoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
