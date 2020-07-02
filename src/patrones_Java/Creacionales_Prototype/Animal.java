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
public class Animal {
    private String description;
    private int numberOfLegs;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public Animal clone() {
        Animal clonedAnimal = null;
        try {
            clonedAnimal = (Animal) super.clone();
            clonedAnimal.setDescription(description);
            clonedAnimal.setNumberOfLegs(numberOfLegs);
            clonedAnimal.setName(name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonedAnimal;
    } // method clone

    public String helloAnimal() {
        return "hi i am a " + getName() + " and i have " + getNumberOfLegs()
                + " legs";
    }

}
