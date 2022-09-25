/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example_on_factory_pattern;

/**
 *
 * @author ROG STRIX
 */
public abstract class Button {

    public abstract void draw();
}

class RoundedButton extends Button {

    @Override
    public void draw() {
        System.out.println("I'm Rounded Button");
    }

}

class SquareButton extends Button {

    @Override
    public void draw() {
        System.out.println("I'm Square Button");
    }

}
