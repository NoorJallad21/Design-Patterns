/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.SimpleFactor;

/**
 *
 * @author ROG STRIX
 */
public class PizzaStore_part1 {
    
    public Pizza orderPizza(String type){
        Pizza pizza=null;
        
        //Creation 
        //always change
        if(type.equalsIgnoreCase("cheese"))
            pizza=new CheesePizza();
        else if (type.equalsIgnoreCase("greek"))
            pizza=new GreekPizza();
        else if(type.equalsIgnoreCase("pepproni"))
            pizza=new PepproniPizza();
        
        //process-preparation
        //this is static operation-not change
        pizza.preparing();
        pizza.back();
        pizza.cut();
        
        return pizza;
    }
    
}


class PizzaStore2{
    public Pizza orderPizza(String type){
        Pizza pizza=null;
        
        //Creation 
        //always change
        if(type.equalsIgnoreCase("cheese"))
            pizza=new CheesePizza();
        else if (type.equalsIgnoreCase("greek"))
            pizza=new GreekPizza();
        else if(type.equalsIgnoreCase("pepproni"))
            pizza=new PepproniPizza();
        
        //process-preparation
        //this is static operation-not change
        pizza.back();
        pizza.cut();
        pizza.preparing();
        
        return pizza;
    }
}

class PizzaStore3{
    public Pizza orderPizza(String type){
        Pizza pizza=null;
        
        //Creation 
        //always change
        if(type.equalsIgnoreCase("cheese"))
            pizza=new CheesePizza();
        else if (type.equalsIgnoreCase("greek"))
            pizza=new GreekPizza();
        else if(type.equalsIgnoreCase("pepproni"))
            pizza=new PepproniPizza();
        
        //process-preparation
        //this is static operation-not change
        pizza.back();
        pizza.cut();
        pizza.preparing();
        
        return pizza;
    }
}
