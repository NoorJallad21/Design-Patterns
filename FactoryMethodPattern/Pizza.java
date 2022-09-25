/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public abstract class Pizza /*this is abstract just be created high level component*/ {

//note very important , all ingredients in factory method pattern has String type

    String dough;
    String souce;
    String cheese;
    String peproni;
    ArrayList<String> toppings = new ArrayList();
    String name;

    public void prepare() {
        /* All attributes are initialized (create) in concrete classes */
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");

        for (String topping : toppings) {
            System.out.print(topping + "   ");
        }

    }

    public void cut() {

        System.out.println("Pizza Cuttinng");

    }

    public void back() {

        System.out.println("Pizza back");

    }

    public String toString() {
        String s = "The Pizza Orderd is : /n";
        s += name + " /n " + dough.toString() + "/n" + cheese.toString() + "/n" + souce.toString() + "/n" + peproni.toString();
        for (String topping : toppings) {
            s += topping + "  ";
        }

        return s;

    }

}
