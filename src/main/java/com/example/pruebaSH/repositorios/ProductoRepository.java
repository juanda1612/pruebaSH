package com.example.pruebaSH.repositorios;

import com.example.pruebaSH.models.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
    public abstract ArrayList<Producto> findProductoById(Integer id);
}
