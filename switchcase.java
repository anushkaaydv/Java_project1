public class switchcase {
    public static void main(String[] args) {
        int n=20;
        String size;
        switch(n){
            case 18:
            size= "small";
            break;
            case 20:
            size= "fit";
            break;
            case 25:
            size="large";
            break;
            default:
            size="unknown";
        }
        System.out.println("size:" + size);
    }
    
}
