import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int p=n;
	int div=1;
	int c=0;
	while(n!=0)
	{
		c++;
		div*=10;
		n=n/10;
	}
	div/=10;
	System.out.println(c);
	System.out.println(div);
	while(c-1!=0 )
	{
		int sum=0;
		int res1=0;
		int res2=0;
		res1=p%div;
		res2=p/div;
		sum=res1*10+res2;
		System.out.println(sum);
		p=sum;
		c--;
	}
	System.out.println(p);
}
}
		