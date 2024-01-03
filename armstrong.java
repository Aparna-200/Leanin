public class armstrong {

        public static void main(String[] args){
            int n = 158;
            int d,sum=0;
            int  temp = n;
            while(n>0){
                d = n%10;
                sum += d*d*d;
                n = n/10;
            }
            if (temp==sum)
                System.out.println("Number is Armstrong !");
            else 
                System.out.println("Number is not Armstrong !");
        }
    }
    
    


    

