 class student{
     int rollno;
     String name;
     static String collegename ="thakur college"; // already initialized value
     public student(int rollno , String name){
         super();
         this.rollno= rollno;
         this.name=name;

     }
     void display(){
         System.out.println(rollno + " " +name + " " +collegename);
     }


    
}
      class demo{ //jisme main h uska naam file ka naam hota h..mere error ara public lagakr
    public static void main(String[] args) {
         student s1= new student(101,"anushka");
         s1.display();
    }
}
