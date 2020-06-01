/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.IDao.IDao;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.List;

/**
 *
 * @author braya
 */
public class ControladorElectrodomesticos implements IDao{
    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IDao dao;
    int cont=0;
    
    public ControladorElectrodomesticos(VistaElectrodomestico vista, Electrodomestico modelo, IDao dao) {
        this.vista = vista;
        this.modelo = modelo;
        this.dao = dao;
    }

    
    @Override
    public void crearTelevision(Television television) {
        vista.ingresarTelevision(television);
        television().add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        vista.ingresarLavadora(lavadora);
    }

    @Override
    public List<Television> television() {
        return television();
    }

    @Override
    public List<Lavadora> lavadora() {
        return lavadora();
    }
    
}
