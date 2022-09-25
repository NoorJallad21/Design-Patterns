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
public class Test {
    public static void main(String[] args) {
        UI_Themes theme=new UI_Themes(new WindowsGUIFactory());
        theme.orderUITheme();
    }
    
}
