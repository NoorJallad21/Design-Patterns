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
public class SimplePizzaFactory {
    
    //here encapsulate the creation process 
    public Pizza createPizza(String type){
        Pizza pizza=null;
        
        //Creation
         if(type.equalsIgnoreCase("cheese"))
            pizza=new CheesePizza();
        else if (type.equalsIgnoreCase("greek"))
            pizza=new GreekPizza();
        else if(type.equalsIgnoreCase("pepproni"))
            pizza=new PepproniPizza();
         
         return pizza;
    }
    
}
