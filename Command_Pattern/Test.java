/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command_Pattern;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author ROG STRIX
 */
public class Test {
    public static void main(String[] args) {
//        CeilingFan fan =new CeilingFan("noor");
//        HighFanCommand high = new HighFanCommand(fan);
//        LowFanCommand low=new LowFanCommand(fan);
//        MediumFanCommand med=new MediumFanCommand(fan);
//        OffFanCommand off=new OffFanCommand(fan);
//        high.execute();
//        low.execute();
//        med.execute();
//        off.execute();
//        off.execute();
//        high.undo();
//         high.undo();
//          high.undo();
//           high.undo();
//            high.undo();
            ArrayList l= new ArrayList();
            l.add(3);
            l.add(4);
            Iterator iterat = l.iterator();
            while (iterat.hasNext()) {
            Object nextElement = iterat.next();
                System.out.println(nextElement);
        }
                
    }
    
}


