/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.ControladorDao.ControladorDao;
import ec.edu.ups.controlador.ControladorElectrodomesticos;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;

/**
 *
 * @author braya
 */
public class Test {

    public static void main(String[] args) {
        Television tel=new Television();
        Lavadora lav=new Lavadora();
        VistaElectrodomestico vista = new VistaElectrodomestico();
        Electrodomestico modelo = new Electrodomestico();
        ControladorDao contrDao=new ControladorDao();
        ControladorElectrodomesticos contrE=new ControladorElectrodomesticos(vista, modelo, contrDao);
        
        System.out.println("Ingrese Television");
        for (int i = 0; i < 1; i++) {
            contrE.crearTelevision(tel);
//            contrE.television();
        }
        System.out.println("Ingrese Lavadora");
        for (int i = 0; i < 1; i++) {
            contrE.crearLavadora(lav);
            vista.mostrarTelevision(tel);
        }
        
        contrE.television();
        contrE.lavadora();
    }
}
