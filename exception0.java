public class exception0 {
    public static void main(String[] args) {
        try{
        System.out.println("100");// execute fine 
        System.out.println("200");// execute fine
        System.out.println(300/0);//give exception mtlb risky code!
        System.out.println("400");
        System.out.println("500");
        }// risky code always in try
        catch(Exception e){ // to catch the exception 
           
             System.out.println(e);// obj of parent cls exception!
        }
        finally{
            System.exit(0); // ye finally ni chlyga! same in case of catch
           // System.out.println("interruption");//it will always execute!
        }
    }
    
}
