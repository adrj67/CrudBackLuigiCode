package com.tutorial.crud.entity;

//import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Table;

@Entity
@Table (name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    //@Basic(optional = false)
    @Column (name = "id")
    private int id;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "precio")
    private float precio;

    public Producto() {
    }

    public Producto(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //tuve que poner un constructor sin ID para que funcionara y diera error en ProductoControler renglon 61
    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
