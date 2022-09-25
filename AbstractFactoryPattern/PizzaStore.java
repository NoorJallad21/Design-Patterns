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
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        //creation
        Pizza pizza=createPizza(type);
        
        //process
        pizza.prepare();
        pizza.back();
        pizza.cut();
        
        return pizza;
        
    }

    public abstract Pizza createPizza(String type) ;
    
}
