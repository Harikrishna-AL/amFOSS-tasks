import java.util.*;

public class Euler4{
    public static boolean Palindrome(long num){
        long sum=0;
        long number = num;
        while (number!=0){
            long r = number%10;
            sum = sum*10 + r;
            number = number /10;

        }
        if (num == sum){
            return true;
        } 
        else{
            return false;    
        }      
    }

    public static void main(String[] args){
        int i,n,j,k;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long arr[] = new long[t];
        for (i=0; i<t; i++){
            n = in.nextInt();
            int value=0,product=0;
            for (j=100; j<999;j++){
                for (k=101; k<= 999; k++){
                    value = j*k;
                    if (Palindrome(value)){
                        if (value > product && value < n){
                            product = value;
                        }
                    }
                }
            }
            arr[i]=product;
        }
        for (i=0; i<t; i++){
            System.out.println(arr[i]);
        }
    }
}
