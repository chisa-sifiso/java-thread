
package expth;


public class ExpTh {

 
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        threatEven tE = new threatEven(1);
        Thread t1 = new Thread(tE);
        
        ThreadOdd tO= new ThreadOdd(1);
      
        Thread.currentThread().setPriority(10);
        t1.setPriority(9);
        
        System.out.println(Thread.currentThread().getName()+" started");
        
        System.out.println("main started "+t1.getName());
        t1.start();
        
        
        System.out.println("main started "+tO.getName());
        tO.start();
    
        
        System.out.println("main finished");
        
       
    }
    
}
