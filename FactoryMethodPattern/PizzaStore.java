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
public abstract class PizzaStore /*<<Abstract Creator>>*/{
    
    //this class do control on creation and process
        
        public Pizza orederPizza(String type){
            //creation
            Pizza pizza=createPizza(type);
            
            //process
            pizza.prepare();
            pizza.back();
            pizza.cut();
            
            return pizza;
            
        }
        
        public abstract Pizza createPizza(String type);//this is factory method 

    
}
