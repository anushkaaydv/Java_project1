public class exception1 {

    public static void main (String[]args){
        try{
        int a = 20;
        int b = 0;
        System.out.println ("a value = " + a);
        System.out.println ("b value = " + b);
        int c = a / b;// exception
        System.out.println ("c value = " + c);
    }
    catch(Exception e){
        System.out.println(e);
        System.out.println("giving exception resolve it!");

    }
    finally{
        System.out.println("interruption");
    }
  }
}
    

