/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_factorymethod;



/**
 *
 * @author chamo
 */
public class CreadorConcreto extends CreadorAbstracto{

    @Override
    public Producto factoryMethod() {
        return new ProductoConcreto();
    }
    
}
