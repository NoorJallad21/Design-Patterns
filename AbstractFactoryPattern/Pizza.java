/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author ROG STRIX
 */
public abstract class Pizza {
    Dough dough;
    Souce souce;
    Vigges[] vigges;
    String name;
    Peproni peproni;
    Cheese cheese;
    
    
    public abstract void prepare();
    
    public void cut() {

        System.out.println("Pizza Cuttinng");

    }

    public void back() {

        System.out.println("Pizza back");

    }

    public String toString() {
        String s = "The Pizza Orderd is : /n";
        s += name + " /n " + dough.toString() + "/n" + cheese.toString() + "/n" + souce.toString() + "/n" + peproni.toString();
        for (Vigges vigges : vigges) {
            s += vigges + "  ";
        }

        return s;

    }
}
