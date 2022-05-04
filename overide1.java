  class parent{
    void display(){
        System.out.println("displaying parent");
    }
    void print(){
        System.out.println("parent print");
    }
}
class child extends parent{
    void display(){
        System.out.println("displaying child");
    }
    void tainee(){
        System.out.println("i am trainee");
    }


}

public class overide1 {
    public static void main(String[] args) {
        child ch1= new child();
        ch1.display();
        ch1.print();
        parent p1= ch1;// passing ref of child into parent so jha tk scope waha tk run hoga oarent!
        p1.display();
        p1.print();
        //p1.trainee();// yha error dega!
    }
    
}
