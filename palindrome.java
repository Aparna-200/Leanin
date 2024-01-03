public class palindrome {

        public static void main(String[] args){
            int n = 12321;
            int d,rev=0;
            int temp = n;
            while(n>0){
                d = n%10;
                rev = rev * 10 + d;
                n = n/10;
            }
            if (temp==rev)
                System.out.println("Number is palindrome !");
            else 
                System.out.println("Number is not palindrome !");
        }
    }
    
    

