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
public class BugguiTour extends ConstructorTour {
    @Override
    public void construirTour()  {
        tour = new Tour();
    }
    
    @Override
    public void construirHoteles() {
        tour.addHotel("Hilton");
        tour.addHotel("Buckingham Palace");
        tour.addHotel("Holiday Inn");
    }

    @Override
    public void construirTickets() {
        tour.addTicket("Caracas");
        tour.addTicket("Londres");
        tour.addTicket("Madrid");
        
    }
}
