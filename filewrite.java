import java.io.File;
import java.io.IOException;
import java.io.FileWriter;//imp
public class filewrite {
    public static void main(String[] args) {
        //String data="hello how are you?";
        try {
            String data="hello how are you? hope you doing fine!";
            FileWriter obj= new FileWriter("b.txt");// filewriter ka hi obj banega file ka ni!
            obj.write(data);
            System.out.println("written successfully!");
            obj.close();
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("cannot write");
            e.printStackTrace();
        }
    }
    
}
