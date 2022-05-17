import java.lang.*;
interface A{
    //by default abs! 
     abstract void print(); // till java 7-> only abs methd allowed unlike abs cls
}
class B implements A{

    @Override
    public void print() {
        
        System.out.println("implementing!");
        
    }
    
    
}
public class interface0 {
    public static void main(String[] args) {
        B obj= new B();
        obj.print();
       // obj.sum();
    }
    
}
