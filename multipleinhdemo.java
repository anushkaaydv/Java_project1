class parent1{
    void display1(){
        System.out.println("display");
    }
}
interface parent2{
    void display();

}
public class multipleinhdemo extends parent1 implements parent2 {
    public static void main(String[] args) {
        multipleinhdemo obj = new multipleinhdemo();
        obj.display1();
        obj.display();
    }
    @Override
    public void display(){
        System.out.println("displaying");
    }
    
}
