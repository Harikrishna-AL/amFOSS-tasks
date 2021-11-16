import java.io.*;
class Euler1 {
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int  t = Integer.parseInt(in.readLine());
        long a,sum;
        for(int i=0; i<t; i++)
        {
            int  n = Integer.parseInt(in.readLine());
            sum = 0;
        for(int j=0; j<n; j++)
        {
            long m3 = (n-1)/3;
            long m5 = (n-1)/5;
            long m15 = (n-1)/15;
            sum = (3*(m3*(m3+1))/2)+(5*(m5*(m5+1))/2)-(15*(m15*(m15+1))/2);
        }
        System.out.println(sum);
    }
 
}

    }
