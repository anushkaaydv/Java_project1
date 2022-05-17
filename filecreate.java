import java.io.File;
import java.io.IOException;
public class filecreate {
    public static void main(String[] args) {
        try{
            File fileobj= new File("b.txt");// create file
            if(fileobj.createNewFile()){
                System.out.println("file created!"+fileobj);
            }
            else{
                System.out.println("already exsist!");
            }
        }
        catch(Exception e){
            System.out.println("error occured in creating file");
            e.printStackTrace();
        }
    }
}
    

