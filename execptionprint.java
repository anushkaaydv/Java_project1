public class execptionprint {
    public static void main(String[] args) throws Exception  {// throw tells tht it has exception
        try{
        System.out.println("100");// execute fine 
        System.out.println("200");// execute fine
        System.out.println(300/0);//give exception mtlb risky code!
        System.out.println("400");
        System.out.println("500");
        }
        catch(Exception e){
            e.printStackTrace();// first!
            System.out.println(e.toString());//second!
            System.out.println(e.getMessage());//third
        }
        finally{
            System.out.println("interruption");
        }
    }
}
