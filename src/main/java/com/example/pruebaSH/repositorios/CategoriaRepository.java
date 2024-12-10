package com.example.pruebaSH.repositorios;

import com.example.pruebaSH.models.Categoria;
import com.example.pruebaSH.models.Proveedore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {
    public abstract ArrayList<Categoria> findCategoriaById(Integer id);
}
