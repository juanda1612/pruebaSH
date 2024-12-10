package com.example.pruebaSH.repositorios;

import com.example.pruebaSH.models.Producto;
import com.example.pruebaSH.models.Proveedore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProveedoreRepository extends CrudRepository<Proveedore, Long> {
    public abstract ArrayList<Proveedore> findProbeedorById(Integer id);
}
