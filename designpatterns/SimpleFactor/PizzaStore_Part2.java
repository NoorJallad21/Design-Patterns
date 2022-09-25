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
public class PizzaStore_Part2 {
    
    //Composition [PizzaStore(Client)  has a SimplePizzaFactory(SimpleFactory)]
    private SimplePizzaFactory factory ;
    
    //this is very very important
    //الفاكتوري الي بمرره بالكونستراكتور هو الي رح يكون مسؤول عن عملية الأنشاء
    //وجودها جدا مهم عشان ان بدي اغير نوع الفاكتوري بمرره وقت الرن تايم 
    //يمكن ترا اني ما امررها بالكونستراكتور واعملها انشلايز فوق مباشرة لانه فش الها سب كلاسز
    public PizzaStore_Part2(SimplePizzaFactory factory){
        this.factory=factory;
    }
    
    public Pizza orderPizza(String type){
        //creation
        Pizza pizza = factory.createPizza(type);
        
        //prepration-process
        pizza.preparing();
        pizza.back();
        pizza.cut();
        
        return pizza;
    }
    
}

class PizzaStore2_part2{
    private SimplePizzaFactory factory;

    public PizzaStore2_part2(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type){
        
        Pizza pizza=factory.createPizza(type);
        
        pizza.preparing();
        pizza.back();
        pizza.cut();
        
        return pizza;
        
    }
}

class PizzaStore3_part2{
    private SimplePizzaFactory factory;

    public PizzaStore3_part2(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type){
        
        Pizza pizza=factory.createPizza(type);
        
        pizza.preparing();
        pizza.back();
        pizza.cut();
        
        return pizza;
        
    }
}
