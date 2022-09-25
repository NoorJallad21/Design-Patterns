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
public class UI_Themes {
    private GUIFactory factory;

    public UI_Themes(GUIFactory factory) {
        this.factory = factory;
    }
    
    public void orderUITheme(){
        Button button=factory.createButton();
        CheckBox checkBox=factory.createCheckBox();
        
        button.draw();
        checkBox.draw();
    }
}
