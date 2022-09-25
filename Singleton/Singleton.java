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

//This is Lazy Initialization
public class Singleton {
    private static Singleton uniqueInstance;
    
    private Singleton(){
        
    }
    //synchronized is expensive , and can decrease performance , the thread do in sequential
    public static synchronized Singleton getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();
        
        return uniqueInstance;
    }
}

//This is Eager Instantiation  - waste resources

class Singleton_1{
    private static Singleton_1 uniqueInstance = new Singleton_1();
    
    private Singleton_1(){}
    
    public static Singleton_1 getInstance(){
        return uniqueInstance;
    }
}

//This is Double-Checked locking

class Singleton_2{
    private volatile static Singleton_2 instance ;
    
    private Singleton_2(){
        
    }
    public static Singleton_2 getInstance(){
        if(instance == null){
            synchronized(Singleton_2.class){
                if(instance == null)
                    instance = new Singleton_2();
            }
        }
        return instance;
    }
}


