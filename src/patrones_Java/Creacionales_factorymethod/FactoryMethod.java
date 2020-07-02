/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_factorymethod;

import patrones_Java.Ejemplo;

/**
 *
 * @author User
 */
public class FactoryMethod  implements Ejemplo{
  CreadorAbstracto creador;
    Producto producto;
    @Override
    public void operacion() {
        creador = new CreadorConcreto();
        producto = creador.crearProducto();
        System.out.println(producto.operacion());
    }  
}
