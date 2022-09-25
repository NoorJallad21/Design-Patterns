/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.SimpleFactor;

/**
 *
 * @author ROG STRIX
 */
public class PepproniPizza implements Pizza{
    
    @Override
    public void preparing() {
        System.out.println("preparing Pepproni pizza");
    }

    @Override
    public void back() {
        System.out.println("back Pepproni pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut Pepproni pizza");
    }
    
    
}
