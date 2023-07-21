import java.util.*;
import java.math.BigInteger;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	        int n = sc.nextInt();
        int count = 0;
        while(n > 1){
            // System.out.println(n);
			  double max = 0;
            int flag = 0;
            for (int i = n; i >= 1; i--) {
                double pow = Math.pow((double) 2,(double) i);
                if(pow == (double)n){
                    flag = 1;
                    break;
                }
                else if(pow < (double)n){
                    if(max < pow){
                        max = pow;
                    }
                }
            }
            if(flag == 1){
                n /= 2;
            }
            else{
                n -= max;
            }
            count++;
        }
		System.out.println(count);
        if(count % 2 == 0)
            System.out.println("Richard");
        else
            System.out.println("Louise");
}
}