/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

/**
 *
 * @author ROG STRIX
 */
public class NYGreekPizza extends Pizza {

    public NYGreekPizza() {
        name="New York Greek Pizza";
        dough="thin dough";
        cheese="cheese ";
        peproni="peproni";
        toppings.add("Grated Reggiano Cheese");
    }
    
}
