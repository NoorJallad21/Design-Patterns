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
public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String type) {
        AbstractIngredientsFactory nyFactory=new NYIngredientFactory();
        Pizza pizza=null;
        if(type.equals("cheese")){
            pizza=new CheesePizza(nyFactory);
            pizza.name="NY Cheese Pizza";
        }
        return pizza;
    }
    
}
