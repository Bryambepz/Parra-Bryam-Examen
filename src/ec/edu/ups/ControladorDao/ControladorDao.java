/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.ControladorDao;

import ec.edu.ups.IDao.IDao;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.SortedSet;

/**
 *
 * @author braya
 */
public class ControladorDao implements IDao{

    private SortedSet<Electrodomestico> electrodomestico;
    @Override
    public void crearTelevision(Television television) {
        electrodomestico.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
        electrodomestico.add(lavadora);
    }

    @Override
    public List<Television> television() {
        electrodomestico.toArray();
        return television();
    }

    @Override
    public List<Lavadora> lavadora() {
        electrodomestico.toArray();
        return lavadora();
    }
    
}
