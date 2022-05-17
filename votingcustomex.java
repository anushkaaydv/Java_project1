class UnderAge extends RuntimeException{
	UnderAge()
	{
		super("You are under  age");
	}
	UnderAge(String message)
	{
		super(message);
	}

}// underage khudka exception!

public class votingcustomex {
    public static void main(String[] args) {
        int age = 13;
        try {
        if(age< 18)
        {
            throw new UnderAge("You can not vote as your age is below 18");
        }// it will throw so const call then msg
        else
        {
            System.out.println("you can vote now...");
        }
        }
        catch(UnderAge e)
        {
            e.printStackTrace();
        }
    }	
}
    

