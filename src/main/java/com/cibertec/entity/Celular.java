package com.cibertec.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_celular")
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_celular;

    private String des_celular;

    private double pre_celular;

    private int sto_celular;

    @ManyToOne(cascade = CascadeType.REFRESH, targetEntity = Marca.class)
    @JoinColumn(name = "id_marca")
    private Marca marca;

    public Celular() {
    }

    public Celular(int cod_celular, String des_celular, double pre_celular, int sto_celular, Marca marca) {
        this.cod_celular = cod_celular;
        this.des_celular = des_celular;
        this.pre_celular = pre_celular;
        this.sto_celular = sto_celular;
        this.marca = marca;
    }

    public int getCod_celular() {
        return cod_celular;
    }

    public void setCod_celular(int cod_celular) {
        this.cod_celular = cod_celular;
    }

    public String getDes_celular() {
        return des_celular;
    }

    public void setDes_celular(String des_celular) {
        this.des_celular = des_celular;
    }

    public double getPre_celular() {
        return pre_celular;
    }

    public void setPre_celular(double pre_celular) {
        this.pre_celular = pre_celular;
    }

    public int getSto_celular() {
        return sto_celular;
    }

    public void setSto_celular(int sto_celular) {
        this.sto_celular = sto_celular;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
