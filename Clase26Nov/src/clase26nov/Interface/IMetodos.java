/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase26nov.Interface;

/**
 *
 * @author Jerson A. Bejarano
 */
/**
Crear una aplicacion que permita guardar, editar, eliminar y buscar informacion sobre Productos, Empleado y Cliente
* en esta clase vamos a definir todos los metodos
*/

public interface IMetodos {
    
    /** 
     * este metodo permite guardar un nuevo registro
     * @param registro
     * @return 
     */
    public int guadarRegistro(Object registro);
    
    /** 
     * Este metodo permite editar un registro existente
     * @param registro
     * @return 
     */
    public int editarRegistro(Object registro);
    
    /**Permite eliminar un registro
     * @param registro
     * @return 
     */
    public int eliminarRegistro(Object registro);
    
    /**
     * Permite buscar un registro por su codigo
     * @param registro
     * @return 
     */
    public Object buscarRegistro(Object registro);
}
