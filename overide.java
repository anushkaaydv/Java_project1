interface A1{
    public int add();
}

class a2 implements A1{
    public int add(){
        int a=10 , b=20;
        int c= a+b;
        System.out.println(c);
        return c;
    }
}
class a3 extends a2{
    public int add(){
        int a= 16 ,  b= 10;
        int c= a+b;
        System.out.println(c);
        return c;

    }
}


public class overide {
    public static void main(String[] args) {
       // A1 obj =new a2();// parent ka hi call a2 m same!
       a2 obj =new a3();// child cls ka call // opp is not possible bcz a2  parent h aur parent child ko access kr skta!
        obj.add();
    }
    
}
