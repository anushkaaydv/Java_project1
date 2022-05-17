import java.io.FileOutputStream;
import java.io.OutputStream;

public class outputstream {


    public static void main(String[] args) {
        String data="i am fine,nice to meet you";
        try {
            OutputStream obj=new FileOutputStream("b.txt");
            obj.write(data.getBytes());
            System.out.println("data entered successfully");
            obj.close();

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}
