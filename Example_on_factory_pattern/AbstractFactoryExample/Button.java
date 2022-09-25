/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example_on_factory_pattern.AbstractFactoryExample;

/**
 *
 * @author ROG STRIX
 */
public abstract class Button {

    public abstract void draw();
}

class MacButton extends Button {

    @Override
    public void draw() {
        System.out.println("Mac Button");
    }

}

class WindowButton extends Button {

    @Override
    public void draw() {
        System.out.println("Window Button");
    }

}
