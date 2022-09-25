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
public class Simple_Factory {

    public Button createButton(String type) {
        Button button = null;
        if (type.equalsIgnoreCase("rounded")) {
            button = new RoundedButton();
        } else if (type.equalsIgnoreCase("square")) {
            button = new SquareButton();
        }

        return button;
    }

}
