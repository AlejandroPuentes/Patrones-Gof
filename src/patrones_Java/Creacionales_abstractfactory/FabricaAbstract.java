/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_abstractfactory;

/**
 *
 * @author User
 */
public interface  FabricaAbstract {
    
    public Board crearBoard();

    public Memoria crearMemoria();

    public Procesador crearProcesador();
}
