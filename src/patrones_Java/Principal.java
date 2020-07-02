/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java;

import java.util.Scanner;
import patrones_Java.Creacionales_Builder.Builder;
import patrones_Java.Creacionales_Prototype.Prototype;
import patrones_Java.Creacionales_abstractfactory.AbstractFactory;
import patrones_Java.Creacionales_factorymethod.FactoryMethod;
import patrones_Java.Creacionales_singleton.Singleton;
import patrones_Java.Creacionales_singleton.Singleton_;

/**
 *
 * @author User
 */
public class Principal {
    public static void main(String[] args) {
        Ejemplo ejemplo = null;
        int opcion = 0;
        int maxOpc = 5;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entre 0 y " + maxOpc
                    + " para ver un ejemplo de patrones");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > maxOpc);
        String patron = "";
        switch (opcion) {
            //Creacionales
            case 0:
                patron = "Singleton";
                ejemplo = new Singleton_();
                break;
            case 1:
                patron = "AbstractFactory";
                ejemplo = new AbstractFactory();
                break;
            case 2:
                patron = "FactoryMethod";
                ejemplo = new FactoryMethod();
                break;
            case 3:
                patron = "Prototype";
                ejemplo = new Prototype();
                break;
            case 4:
                patron = "Builder";
                ejemplo = new Builder();
                break;
            }
        System.out.println("Patron: '" + patron + "'");
        ejemplo.operacion();
    }
}
