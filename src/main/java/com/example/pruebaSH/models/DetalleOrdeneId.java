package com.example.pruebaSH.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class DetalleOrdeneId implements java.io.Serializable {
    private static final long serialVersionUID = 1998713895702248208L;
    @Column(name = "ORDENID", nullable = false)
    private Integer ordenid;

    @Column(name = "DETALLEID", nullable = false)
    private Integer detalleid;

    public Integer getOrdenid() {
        return ordenid;
    }

    public void setOrdenid(Integer ordenid) {
        this.ordenid = ordenid;
    }

    public Integer getDetalleid() {
        return detalleid;
    }

    public void setDetalleid(Integer detalleid) {
        this.detalleid = detalleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DetalleOrdeneId entity = (DetalleOrdeneId) o;
        return Objects.equals(this.ordenid, entity.ordenid) &&
                Objects.equals(this.detalleid, entity.detalleid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordenid, detalleid);
    }

}