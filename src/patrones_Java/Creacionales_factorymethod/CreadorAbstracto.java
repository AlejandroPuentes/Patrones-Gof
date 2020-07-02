/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_factorymethod;



/**
 *
 * @author chamo
 */
public abstract class CreadorAbstracto {
    public Producto crearProducto(){
        return factoryMethod();
    }
    
    public abstract Producto factoryMethod();
    
}
