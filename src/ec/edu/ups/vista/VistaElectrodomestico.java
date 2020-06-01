/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.Scanner;
import java.util.SortedSet;

/**
 *
 * @author braya
 */
public class VistaElectrodomestico {
    Scanner l= new Scanner(System.in);
    SortedSet<Television> televisiones;
    SortedSet<Lavadora> lavadoras;
    
    public void ingresarTelevision(Television television){
        System.out.println("Ingrese codigo");
        int codigo=l.nextInt();
        System.out.println("Ingrese Descripcion");
        String des=l.next();
        System.out.println("Ingrese Precio Base");
        int pB=l.nextInt();
        System.out.println("Ingrese color");
        String color=l.next();
        System.out.println("Ingrese Consumo de energia");
        char con=l.next().charAt(0);
        System.out.println("Ingrese Peso");
        int peso=l.nextInt();
        System.out.println("Ingrese Resolucion");
        int resolucion=l.nextInt();
        System.out.println("Confirme si tiene o no HDMI");
        Boolean confirmar=l.nextBoolean();
        television.setCodigo(codigo);
        television.setDescripcion(des);
        television.setPrecioBase(pB);
        television.setColor(color);
        television.setConsumoEnergetico(con);
        television.setPeso(peso);
        television.setResolucion(resolucion);
        television.setPuertoHDMI(true);
    }
    
    public void ingresarLavadora(Lavadora lavadora){
        System.out.println("Ingrese codigo");
        int codigo=l.nextInt();
        System.out.println("Ingrese Descripcion");
        String des=l.next();
        System.out.println("Ingrese Precio Base");
        int pB=l.nextInt();
        System.out.println("Ingrese color");
        String color=l.next();
        System.out.println("Ingrese Consumo de energia");
        String con=l.next();
        System.out.println("Ingrese Peso");
        int peso=l.nextInt();
        System.out.println("Ingrese Carga");
        int carga=l.nextInt();
        lavadoras.add(lavadora);
    }
    
    public Television mostrarTelevision(Television television){
        return mostrarTelevision(television);
    }
    
    public Lavadora mostrarLavadora(Lavadora lavadora){
        return mostrarLavadora(lavadora);
    }
}
