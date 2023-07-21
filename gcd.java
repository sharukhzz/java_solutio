import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
gcd(a,b);
}
public static void gcd(int a,int b)
{
	if(b!=0)
	{
		gcd(b,a%b);
	}
	else
	{
		System.out.println(a);
	}
}
}