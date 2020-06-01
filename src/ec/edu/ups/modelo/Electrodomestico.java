/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author braya
 */
public class Electrodomestico {
    private int codigo;
    private String descripcion;
    private double precioBase;
    private String color;
    private int consumoenergetico;
    private int peso;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoenergetico() {
        return consumoenergetico;
    }

    public void setConsumoenergetico(int consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico" + "codigo: " + codigo + " descripcion: " + descripcion + " precioBase: " + precioBase 
                + " color: " + color + " consumoenergetico: " + consumoenergetico + " peso: " + peso;
    }
    
    
}
