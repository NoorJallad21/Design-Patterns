/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author ROG STRIX
 */
public class Test {

    public static void main(String[] args) {
        Singleton_2 s1 = Singleton_2.getInstance();
        Singleton_2 s2 = Singleton_2.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }

}
