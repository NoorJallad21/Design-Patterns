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
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new ChicagoCheesePizza();
        } else if (type.equalsIgnoreCase("Greek")) {
            return new ChicagoGreekPizza();
        } else if (type.equalsIgnoreCase("Vigge")) {
            return new ChicagoViggiePizza();
        }

        return null;
    }

}
