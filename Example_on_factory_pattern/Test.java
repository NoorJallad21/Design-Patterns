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
public class Test {
    public static void main(String[] args) {
        //test on simple factory
        
        /*Simple_Factory factory = new Simple_Factory();
        
        ButtonDesign design =new ButtonDesign(factory);
        design.drawButton("square");*/
        
        //test on factory method
        DesignButton_FM design = new WindowDesignButton();
        design.drawButton("rounded");
    }
    
}
