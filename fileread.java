import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class fileread {
    public static void main(String[] args) {
        try {
            File fileobj=new File("b.txt");//scanner ke obj ke ref m jayga fileobj!
            Scanner obj1 =new Scanner(fileobj);//scanner ref. lera!->scanner ref lega obj ka aur file ref filename se obj mangega!
            while(obj1.hasNextLine()){
                String data= obj1.nextLine();
                System.out.println(data);
            }
            obj1.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("error");
        }
    }
    
}
