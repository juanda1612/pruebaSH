package com.example.pruebaSH.models;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_ordenes", schema = "entidades")
public class DetalleOrdene {
    @EmbeddedId
    private DetalleOrdeneId id;

    @MapsId("ordenid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDENID", nullable = false)
    private com.example.pruebaSH.models.Ordene ordenid;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PRODUCTOID", nullable = false)
    private com.example.pruebaSH.models.Producto productoid;

    @Column(name = "CANTIDAD", nullable = false)
    private Integer cantidad;

    public DetalleOrdeneId getId() {
        return id;
    }

    public void setId(DetalleOrdeneId id) {
        this.id = id;
    }

    public com.example.pruebaSH.models.Ordene getOrdenid() {
        return ordenid;
    }

    public void setOrdenid(com.example.pruebaSH.models.Ordene ordenid) {
        this.ordenid = ordenid;
    }

    public com.example.pruebaSH.models.Producto getProductoid() {
        return productoid;
    }

    public void setProductoid(com.example.pruebaSH.models.Producto productoid) {
        this.productoid = productoid;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}