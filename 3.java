import java.util.*;
import java.util.Scanner;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%3==0)
	{
		System.out.println("the number is divisible by 3");
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+a;
		}
		
		System.out.println("sum is : "+sum);
		if(sum>100)
		{
				System.out.printf("%02d",sum%100);
		}
		if(sum<100)
		{
			int sum2=0;
			sum2=sum%10;
			System.out.println("the number is : "+sum2);
		}
		if(sum<10)
		{
			int sum3=0;
			sum3=sum/10;
			System.out.println("the number is : "+sum3);
		}
			
	}	
	else
	{
		System.out.println("the number is not divisible by 3");
	}
}
}