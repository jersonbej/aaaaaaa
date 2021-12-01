/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase26nov;

import dao.DaoProducto;
import modelos.Producto;

/**
 *
 * @author Jerson A. Bejarano
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    Producto product1 = new Producto(1, "Cafe", 100);
    Producto porduct2 = new Producto(2, "Avena", 130);
    Producto product3 = new Producto(3, "Pinolillo", 80);
    DaoProducto productos = new DaoProducto();
    
    productos.guardarRegistro(product1);
    productos.guardarRegistro(product2);
    prodcutos.guardarRegistro(product3);
    
    for(Producto p: productos.lista){
    System.out.println(p.String());
}
    
}
