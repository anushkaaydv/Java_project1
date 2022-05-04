 import java.lang.*;
 abstract class A{
    abstract void display(); // make cls also abs!
    void sum(){
        int a=10, b=20;
        int c= a+b;
        System.out.println(c);
    }
}
class B extends A{

    
    void display() {
        
        System.out.println("displaying abs method");
        
    }
    
}
public class abstract0  {
   
    public static void main(String[] args) {
       //A obj= new A();// not possible! obj of abs cls cannot be initiated!->Rule
       B obj = new B();
       obj.display();
       obj.sum();
    }
}
