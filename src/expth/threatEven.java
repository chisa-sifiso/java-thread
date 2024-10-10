/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expth;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sifiso
 */
public class threatEven implements Runnable{
   private int num;
    public threatEven (int start) {
        this.num=start;
    }

    
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started");
        
        for (int i= num; num < 10; num++) {
            if(num%2==0){
                System.out.println( +num);
                
            }
           
        }
        System.out.println(Thread.currentThread().getName()+ " finished.");
    }
    
}
