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
public class Agencia {
     private ConstructorTour constructor;

    public void setConstructor(ConstructorTour constructor) {
        this.constructor = constructor;
    }
    
    public Tour getTour(){
        return constructor.getTour();
    }
    
    public void construirTour(){
        constructor.construirTour();
        constructor.construirHoteles();
        constructor.construirTickets();
    }
}
