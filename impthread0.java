import java.lang.*;
  class demo extends Thread{
    @Override
    public  void run(){
        System.out.println("thread is running..");
 
    }
}
 

 public class impthread0  {
   
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.start();//start invokes run and start is present in thread!
    }
    
}
