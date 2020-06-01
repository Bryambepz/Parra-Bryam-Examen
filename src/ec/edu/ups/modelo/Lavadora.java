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
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora( int codigo) {
        super(codigo);
    }

    @Override
    public double obtenerPrecioFinal() {
        double aumetoPrecio=0.00;
        if(carga>30){
            aumetoPrecio=50;
        }
        return super.obtenerPrecioFinal()+aumetoPrecio;
        
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLavadora" + "\ncarga: " + carga;
    }
    
    
    
    
    
}
