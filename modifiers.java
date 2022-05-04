public class modifiers {
    public int add(int a,int b){ // isko public krna pdega taki dosra pkg access kr paye 
        int c= a+b;
        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
        modifiers obj= new modifiers();
        obj.add(10, 20);
    }
    
}
