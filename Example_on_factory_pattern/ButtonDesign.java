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
public class ButtonDesign {

    //this is client class
    Simple_Factory factory;

    public ButtonDesign(Simple_Factory factory) {
        this.factory = factory;
    }

    public Button drawButton(String type) {
        //creation
        Button button = factory.createButton(type);
        //process
        button.draw();

        return button;
    }

}
