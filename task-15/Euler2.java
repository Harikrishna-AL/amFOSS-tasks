import java.io.*;
class Euler2 {
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long nt, t1=0, t2=1;
        long t = Long.parseLong(in.readLine());
    
        long sum;
    
    for(int i=0; i<t; i++)
    {
        long n = Long.parseLong(in.readLine());
        nt = t1 + t2;
        sum=0;
        while(nt<=n)
        {
            t1 = t2;
            t2 = nt;
            nt = t1 + t2;
            if(nt%2==0 && nt<=n)
            {
                sum += nt;
            }
        }
        System.out.println(sum);
        t1 = 0;
        t2 = 1;
    }
    }
}
