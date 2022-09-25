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
public class Test {
    public static void main(String[] args) {
        SimplePizzaFactory factory =new SimplePizzaFactory();
        PizzaStore_Part2 myStore =new PizzaStore_Part2(factory);
        myStore.orderPizza("Cheese");
        PizzaStore2_part2 myStore2 =new PizzaStore2_part2(factory);
        myStore2.orderPizza("Greek");
        
        
    }
    
}
