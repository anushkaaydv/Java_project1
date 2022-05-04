class A{
    void x(){
        System.out.println("method of a is called");
    }
     static void sum(){
        int a= 10 , b=20;
        int sum= a+b;
        System.out.println("the sum is:"+sum);
    }
}
class B extends A{
    void x(){
        System.out.println("method of b is called");
    }
    void sum(){// parent class methd is called bcz static cannot be overriden!
        int a= 20 , b=20;
        int sum= a+b;
        System.out.println("the sum is:"+sum);
    }
}

public class overide2 {
    public static void main(String[] args) {
        A obj = new B();
        obj.x();
        obj.sum();
    }
    
}
