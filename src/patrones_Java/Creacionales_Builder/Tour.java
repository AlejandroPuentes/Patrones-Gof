/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_Builder;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Tour {
    
    private ArrayList<String> hoteles = new ArrayList<String>();
    private ArrayList<String> tickets = new ArrayList<String>();
    
    public void addHotel(String h){
        hoteles.add(h);
    }
    
    public void addTicket(String t){
        tickets.add(t);
    }

    public ArrayList<String> getHoteles() {
        return hoteles;
    }

    public ArrayList<String> getTickets() {
        return tickets;
    } 
    
}
