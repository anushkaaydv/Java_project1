class movieapp{
    int totalseats=10;
  synchronized public  void bookseats(int seats){// creates deadlock for next process
        if(totalseats>=seats){
            System.out.println(seats+"seats are booked");
            totalseats=totalseats- seats;
            System.out.println(" seates left="+totalseats);
        }
        else{
            System.out.println("no tickets available");
            System.out.println("available seats"+totalseats);
        }
    }
}
public class usingthreadsol extends Thread{
    int seats;
    static movieapp m;//taking the ref or instance of cls movie to call the methd
    public void run(){// run in thread!
        m.bookseats(seats );
        
    }
    public static void main(String[] args) {
        m=new movieapp();// obj initialize krna vrna m toh ref hi tha!
        usingthreadsol user1=new usingthreadsol();//user 1 first after tht it jumps to user 2 without implementing whole body!
        usingthreadsol user2= new usingthreadsol();
        user1.seats=11;
        user1.start();
        user2.seats=6;
        user2.start();
    }
    
}

    

