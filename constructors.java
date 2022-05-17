class Student {
    String name;
    int age;
    Student(){
        System.out.println("default called");
    }
    Student(String name , int age){
        this.name= name;
        this.age=age;
        System.out.println("parmetrized called");
        System.out.println("student name is"+name+"age is"+age);
    }
    Student(Student s){
        this.name= s.name;
        this.age=s.age;
        System.out.println("copy called");
        System.out.println("student name is"+name+ "age is"+age);


    }
}

public class constructors {
    public static void main(String[] args) {
        Student obj1=new Student();
        Student obj2= new Student("anu", 22);   
        Student obj3=obj2;
     }
        
}
