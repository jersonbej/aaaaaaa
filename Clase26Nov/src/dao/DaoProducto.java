/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import clase26nov.Interface.IMetodos;
import java.util.ArrayList;
import modelos.Producto;

/**
 *
 * @author Jerson A. Bejarano
 */
public class DaoProducto implements IMetodos {
public ArrayList<Producto> lista = new ArrayList();   
    @Override
    public int guadarRegistro(Object registro) {
       
        lista.add((Producto) registro);
        return 1;
        
    }
    
    public int guardarRegistro(int codigo, String nombre, double precio){
       lista.add(new Producto(codigo, nombre, precio));
        return 1;
    }

    @Override
    public int editarRegistro(Object registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminarRegistro(Object registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscarRegistro(Object registro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
