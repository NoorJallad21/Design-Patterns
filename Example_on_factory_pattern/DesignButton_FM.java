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
public abstract class DesignButton_FM {
    //this is abstract creator

    public Button_FM drawButton(String type) {
        Button_FM button = createButton(type);

        button.draw();
        return button;
    }

    public abstract Button_FM createButton(String type);//this is abstract factory method

}

//this is concrete creators
class MacDesignButton extends DesignButton_FM {

    @Override
    public Button_FM createButton(String type) {
        Button_FM button = null;
        if (type.equalsIgnoreCase("square")) {
            button = new MacSquareButton();
        } else if (type.equalsIgnoreCase("rounded")) {
            button = new MacRoundedButton();
        }
        return button;
    }
}

class WindowDesignButton extends DesignButton_FM {

    @Override
    public Button_FM createButton(String type) {
        Button_FM button = null;
        if (type.equalsIgnoreCase("square")) {
            button = new WindowSquareButton();
        } else if (type.equalsIgnoreCase("rounded")) {
            button = new WindowRoundedButton();
        }
        return button;
    }

}
