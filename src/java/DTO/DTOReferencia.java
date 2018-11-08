/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Administrator
 */
public class DTOReferencia {

    public int getId_referencia() {
        return id_referencia;
    }

    public void setId_referencia(int id_referencia) {
        this.id_referencia = id_referencia;
    }

    public String getNombre_referencia() {
        return nombre_referencia;
    }

    public void setNombre_referencia(String nombre_referencia) {
        this.nombre_referencia = nombre_referencia;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DTOReferencia(int id_referencia, String nombre_referencia, int id_zona, String color) {
        this.id_referencia = id_referencia;
        this.nombre_referencia = nombre_referencia;
        this.id_zona = id_zona;
        this.color = color;
    }
    
    private int id_referencia;
    private String nombre_referencia;
    private int id_zona;

    public DTOReferencia(int id_referencia, String nombre_referencia, int id_zona, String color, String nombre_zona) {
        this.id_referencia = id_referencia;
        this.nombre_referencia = nombre_referencia;
        this.id_zona = id_zona;
        this.color = color;
        this.nombre_zona = nombre_zona;
    }
    private String color;
    private String nombre_zona;
    public String getNombre_zona() {
        return nombre_zona;
    }

    public void setNombre_zona(String nombre_zona) {
        this.nombre_zona = nombre_zona;
    }
   
}
