/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_Java.Creacionales_Prototype;

/**
 *
 * @author User
 */
public class AnimalCreator {
    private Chicken chicken;
    private Sheep sheep;

    public AnimalCreator() {
        chicken = new Chicken();
        sheep = new Sheep();
        
        chicken.setDescription("a litle chicken");
        chicken.setName("chicken");
        chicken.setNumberOfLegs(2);
        
        sheep.setDescription("a litle sheep");
        sheep.setName("sheep");
        sheep.setNumberOfLegs(4);
    }
    
    

    public Animal retrieveAnimal(String kindOfAnimal) {
        if ("Chicken".equals(kindOfAnimal)) {
            return (Animal) chicken.clone();
        } else if ("Sheep".equals(kindOfAnimal)) {
            return (Animal) sheep.clone();
        } // if	

        return null;
    }
}
