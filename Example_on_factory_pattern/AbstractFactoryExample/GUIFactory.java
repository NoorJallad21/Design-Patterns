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
public interface GUIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
    
}

class MACGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
    
}

class WindowsGUIFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
    
}