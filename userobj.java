import java.util.HashSet;
import java.util.Set;


class Student1{
    int rollno;
    int marks;
    String name;
    
    Student1(int no,int marks,String name){
        this.rollno=no;
        this.marks=marks;
        this.name=name;
        
    }
    public String toString(){//overriding the toString() method
        return rollno+" "+marks+" "+name;
    }
        
        
    
}
public class userobj  {
    public static void main(String[] args) {
      
        Student1 obj1=new Student1(1, 50, "anushka");
        Student1 obj2= new Student1(2, 70,"shyam");
        Student1 obj3=new Student1(3, 80, "ram");
        Set <Student1> s= new HashSet<>();
        s.add(obj1);
        s.add(obj2);
        s.add(obj3);
        System.out.println(s);
    }
    
}
