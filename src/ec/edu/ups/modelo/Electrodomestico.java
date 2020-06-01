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
    private char consumoEnergetico;
    private int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int codigo) {
        this.codigo = codigo;
    }
    
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

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double obtenerPrecioFinal(){
        double conEnergetico=0.00;
        double vpeso=0.00;
        if(consumoEnergetico== 'A'){
            conEnergetico=100;
        }else if(consumoEnergetico=='B'){
            conEnergetico=80;
        }else if(consumoEnergetico=='C'){
            conEnergetico=60;
        }else if(consumoEnergetico=='D'){
            conEnergetico=50;
        }else if(consumoEnergetico=='E'){
            conEnergetico=30;
        }else if(consumoEnergetico=='F'){
            conEnergetico=10;
        }
        
        if(peso>=0 && peso<=19){
            vpeso=10;
        }else if(peso>=20 && peso<=49){
            vpeso=50;
        }else if(peso>=50 && peso<=79){
            vpeso=0;
        }else if(peso>=80){
            vpeso=100;
        }
        return precioBase+conEnergetico+vpeso;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Electrodomestico other = (Electrodomestico) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Electrodomestico" + "\ncodigo: " + codigo + " descripcion: " + descripcion + " precioBase: " + precioBase 
                + " color: " + color + " consumoenergetico: " + consumoEnergetico + " peso: " + peso;
    }
    
    
}
