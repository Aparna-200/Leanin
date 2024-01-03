public class count {
    public static void main(String[] args){
        int n = 45632;
        int d,c=0;
        while(n>0){
            d = n%10;
            c++;
            n = n/10;
        }
        System.out.println("Number of digits in the number :"+c);
    }
}
