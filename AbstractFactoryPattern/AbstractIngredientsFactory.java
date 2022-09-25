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
public interface AbstractIngredientsFactory {

    public Dough createDough();

    public Souce createSouce();

    public Vigges[] createvigges();

    public Cheese createCheese();

    public Peproni createPeproni();
}
