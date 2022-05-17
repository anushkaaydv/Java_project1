import java.io.FileInputStream;
import java.io.InputStream;
//alag se file  obj banane ki zarrurat nhi 

public class inputsream {
    public static void main(String[] args) {
        byte [] array= new byte[50];
        try {
            InputStream obj=new FileInputStream("b.txt");//works only in byte!
            System.out.println("input stream created!");
            System.out.println("data available"+obj.available());
            //read byte from input
            obj.read(array);
            System.out.println("read from file!");
            System.out.println(array);
            //convert byte to string
            String data=new String(array);
            System.out.println(data);
            obj.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
