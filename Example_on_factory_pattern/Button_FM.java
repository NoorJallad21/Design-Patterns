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
public abstract class Button_FM {
    //this is abstract product

    public abstract void draw();

}

//all this concrete product
class MacRoundedButton extends Button_FM {

    @Override
    public void draw() {
        System.out.println("Mac Rounded Button");
    }

}

class MacSquareButton extends Button_FM {

    @Override
    public void draw() {
        System.out.println("Mac Square Button");
    }

}

class WindowRoundedButton extends Button_FM {

    @Override
    public void draw() {
        System.out.println("Windos Rounded Button");
    }

}

class WindowSquareButton extends Button_FM {

    @Override
    public void draw() {
        System.out.println("Windos Square Button");
    }

}
