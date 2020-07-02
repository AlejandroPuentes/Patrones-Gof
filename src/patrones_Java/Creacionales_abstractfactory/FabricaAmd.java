/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_abstractfactory;



/**
 *
 * @author chamo
 */
public class FabricaAmd implements  FabricaAbstract{

    @Override
    public Board crearBoard() {
        return new BoardAmd();
    }

    @Override
    public Memoria crearMemoria() {
        return new MemoriaAmd();
    }

    @Override
    public Procesador crearProcesador() {
        return new ProcesadorAmd();
    }
    
}
