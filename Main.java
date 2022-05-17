import java.util.HashSet;



import java.util.Set;






class Student{



int rollno;



int marks;



String name;





Student(int no,int marks,String name){



this.rollno=no;



this.marks=marks;



this.name=name;





}
public String toString(){//overriding the toString() method
return rollno+" "+marks+" "+name;
}





}
public class Main {
    public static void main(String[] args) {





        Student obj1=new Student(1, 50, "anushka");
        
        
        
        Student obj2= new Student(2, 70,"shyam");
        
        
        
        Student obj3=new Student(3, 80, "ram");
        
        
        
        Set <Student> s= new HashSet<>();
        
        
        
        s.add(obj1);
        
        
        
        s.add(obj2);
        
        
        
        s.add(obj3);
        
        
        
        System.out.println(s);
        
        
        
        }
    
}
