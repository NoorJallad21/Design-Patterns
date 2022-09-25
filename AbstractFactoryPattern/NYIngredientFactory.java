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
public class NYIngredientFactory implements AbstractIngredientsFactory {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Souce createSouce() {
        return new SouceA();
    }

    @Override
    public Vigges[] createvigges() {
        Vigges[] arr = {new ViggesA(), new ViggesB()};
        return arr;
    }

    @Override
    public Cheese createCheese() {
        return new CheeseA();
    }

    @Override
    public Peproni createPeproni() {
        return new PeproniA();
    }

}
