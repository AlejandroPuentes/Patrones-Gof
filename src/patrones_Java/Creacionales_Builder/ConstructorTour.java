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
public abstract class ConstructorTour {
    protected Tour tour;

    public Tour getTour() {
        return tour;
    }
    
    public abstract void construirTour();
    public abstract void construirHoteles();
    public abstract void construirTickets(); 
}
