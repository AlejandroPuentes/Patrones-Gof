/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_abstractfactory;

import java.util.Scanner;
import patrones_Java.Ejemplo;

/**
 *
 * @author User
 */
public class AbstractFactory  implements Ejemplo{
    FabricaAbstract fabrica;
    Memoria memoria;
    Procesador procesador;
    Board board;
    Scanner escaner;
    int opcion = 0;

    @Override
    public void operacion() {
        escaner = new Scanner(System.in);

        do {
            System.out.println("Ingrese 1 para AMD o 2 para Intel o 3 para Alien");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);

        switch (opcion) {
            case 1:
                fabrica = new FabricaAmd();
                break;
            case 2:
                fabrica = new FabricaIntel();
                break;
            case 3:
                fabrica = new FabricaAlien();
                break;
        }

        board = fabrica.crearBoard();
        memoria = fabrica.crearMemoria();
        procesador = fabrica.crearProcesador();

        System.out.println(board.operacion());
        System.out.println(procesador.operacion());
        System.out.println(memoria.operacion());

    }
}
