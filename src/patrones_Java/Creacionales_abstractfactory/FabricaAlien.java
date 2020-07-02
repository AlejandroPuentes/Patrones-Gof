/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_abstractfactory;



/**
 *
 * @author chamo
 */
public class FabricaAlien implements  FabricaAbstract{

    @Override
    public Board crearBoard() {
        return new BoardAlien();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaAlien();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorAlien();
    }

}
