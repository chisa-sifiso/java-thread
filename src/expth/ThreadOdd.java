/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expth;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sifiso
 */
public class ThreadOdd extends Thread{
    private int num;

    public ThreadOdd(int startNum) {
        this.num=startNum;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" started"); 
        for (int i = num; num < 10; num++) {
          if(num%2!=0){
              System.out.println(num);
          }
            try {
                super.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadOdd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName()+ " finished.");
    }
 
    
}
