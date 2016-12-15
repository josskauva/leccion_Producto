/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leccion.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

  @Entity (name= "producto")  
public class Producto {
    
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int productoid;
   private String nombre;
   private double precio;
   private int cantidad; 

    public Producto(int productoid, String nombre, double precio, int cantidad) {
        this.productoid = productoid;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
   
   
   public Producto (){
       super();
   }

    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
   
}
