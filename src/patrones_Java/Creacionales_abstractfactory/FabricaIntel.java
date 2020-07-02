/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_abstractfactory;



/**
 *
 * @author chamo
 */
public class FabricaIntel implements FabricaAbstract{
    
    @Override
    public Board crearBoard() {
        return new BoardIntel();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaIntel();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorIntel();
    }
}
