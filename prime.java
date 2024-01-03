
public class prime {
        public static void main(String[] args){
            int n = 11;
            int c = 0;
            for(int i = 2;i<n/2;i++)
                if(n%i==0){
                  c = 1;
                    break;
                  }
            if(c==1)     
              System.out.println(n +" is Prime number");
            else
              System.out.println(n +" is not Prime number");
        }
    }
    
    

