package com.example.pruebaSH.models;

import jakarta.persistence.*;

@Entity
@Table(name = "productos", schema = "entidades")
public class Producto {
    @Id
    @Column(name = "PRODUCTOID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "PROVEEDORID", nullable = false)
    private com.example.pruebaSH.models.Proveedore proveedorid;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "CATEGORIAID", nullable = false)
    private Categoria categoriaid;

    @Column(name = "DESCRIPCION", length = 50)
    private String descripcion;

    @Column(name = "PRECIOUNIT", nullable = false)
    private Integer preciounit;

    @Column(name = "EXISTENCIA", nullable = false)
    private Integer existencia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public com.example.pruebaSH.models.Proveedore getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(com.example.pruebaSH.models.Proveedore proveedorid) {
        this.proveedorid = proveedorid;
    }

    public Categoria getCategoriaid() {
        return categoriaid;
    }

    public void setCategoriaid(Categoria categoriaid) {
        this.categoriaid = categoriaid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPreciounit() {
        return preciounit;
    }

    public void setPreciounit(Integer preciounit) {
        this.preciounit = preciounit;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

}