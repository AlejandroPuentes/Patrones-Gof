/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_Builder;

/**
 *
 * @author User
 */

import java.util.Iterator;
import patrones_Java.Ejemplo;

public class Builder implements Ejemplo {

    public void operacion() {
        Agencia agencia = new Agencia();
        agencia.setConstructor(new BugguiTour());
        agencia.construirTour();
        
        Tour tour = agencia.getTour();
        Iterator itHoteles = tour.getHoteles().listIterator();
        Iterator itTickets = tour.getTickets().listIterator();
        while(itHoteles.hasNext() ){
            System.out.println(itTickets.next() + " en el " + itHoteles.next());
        }
    }
}
