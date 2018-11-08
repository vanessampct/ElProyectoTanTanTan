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
public class DTOKardex {

    public int getId_kardex() {
        return id_kardex;
    }

    public void setId_kardex(int id_kardex) {
        this.id_kardex = id_kardex;
    }

    public int getId_tabla() {
        return id_tabla;
    }

    public void setId_tabla(int id_tabla) {
        this.id_tabla = id_tabla;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public DTOKardex(int id_kardex, int id_tabla, String referencia, String zona, String fecha, int saldo, int entrada, int salida, int total, int id_pedido) {
        this.id_kardex = id_kardex;
        this.id_tabla = id_tabla;
        this.referencia = referencia;
        this.zona = zona;
        this.fecha = fecha;
        this.saldo = saldo;
        this.entrada = entrada;
        this.salida = salida;
        this.total = total;
        this.id_pedido = id_pedido;
    }

    public DTOKardex(int id_kardex, int id_tabla, String referencia, String zona, String fecha, int saldo, int entrada, int salida, int total) {
        this.id_kardex = id_kardex;
        this.id_tabla = id_tabla;
        this.referencia = referencia;
        this.zona = zona;
        this.fecha = fecha;
        this.saldo = saldo;
        this.entrada = entrada;
        this.salida = salida;
        this.total = total;
    }
    private int id_kardex;
    private int id_tabla;
    private String referencia;
    private String zona;
    private String fecha;
    private int saldo;
    private int entrada;
    private int salida;
    private int total;
    private int id_pedido;
}
