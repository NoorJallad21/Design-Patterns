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
public class PeproniPizza extends Pizza {

    AbstractIngredientsFactory factory;

    public PeproniPizza(AbstractIngredientsFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Prepare " + name);
        dough = factory.createDough();
        souce = factory.createSouce();
        cheese = factory.createCheese();
        peproni=factory.createPeproni();
    }

}
