/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_abstractfactory;

/**
 *
 * @author chamo
 */
public class ProcesadorIntel implements Procesador{
    
    @Override
    public String operacion() {
        return "creando procesador Intel";
    }
}
