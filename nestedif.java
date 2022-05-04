
public class nestedif {
    public static void main(String[] args) {
        
    
    String country="india";
    int age =17;
    if(country=="india"){
        if(age>18){
            System.out.println("eligible for voting in india");
        }
        else{
            System.out.println("enter valid age");
        }
    }
    else{
        System.out.println("not eligible");
    }
}
    
    
}
