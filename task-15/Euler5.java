import java.util.*;

public class main {
    public static void main(String[] args)throws NoSuchElementException{
        Scanner in = new Scanner(System.in);
        int t,j;
        t = in.nextInt();
        for(int i=0; i<t; i++)
        {
          
            int n = in.nextInt();
            int k=n;
            
            while(k>=n)
            {
                for(j=2;j<=n;j++)
                {
                    if(k%j != 0)
                        break;
                }
                if(j == n+1)
                {
                    System.out.println(k);
                    
                    break;
                }
                k++;
            }
            k=0;

        }
    }
    
    
}
