class supportportal{
    int unresolved=0;
    int resolved=0;
   synchronized public void ticketraise(int tickets){
        
            System.out.println("ticket created"+tickets);
            unresolved+=tickets;
            System.out.println("unresolved tickets left"+ " " +unresolved);
    
    }
     synchronized public void ticketresolve(int tickets){
        if(unresolved<tickets){// mere pass uti ticket h hi ni jiti m resolve krna chari
            System.out.println("unresolvedtickets cannot be less than totaltickets ");
            System.out.println("unresolved remaining"+unresolved);
        }
        else{
            unresolved-=tickets;
            System.out.println(tickets+ "tickets resolved succesfully");
            System.out.println("tickets unresolved"+unresolved);
            
            


        }
    }

}
public class threadeg extends Thread{
    int tickets;
    static supportportal m;//taking the ref or instance of cls movie to call the methd
    public void run(){// run in thread!
        m.ticketraise(tickets);
        m.ticketresolve(tickets);
        
    }
    public static void main(String[] args) {
        m=new supportportal();
        threadeg user1= new threadeg();
        user1.tickets=5;
        user1.start();
        threadeg user2= new threadeg();
        user2.tickets=2;
        user2.start();



    }
    
}
