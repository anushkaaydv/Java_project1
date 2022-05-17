class demo1 implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("running...");
        
    }
    
}
public class impthread1 {
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        Thread t1 = new Thread(d1);
        //Thread t1 = new Thread(d1);// error bcz after run..it gets terminate
        Thread t2 = new Thread(d1);
        t1.start();
        t2.start();
    }
    
}
