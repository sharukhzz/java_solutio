import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sol=n%8;
	if(sol==1 || sol==9)
	{
		System.out.println("Thumb");
	}
	else if(sol==2 || sol==8)
	{
		System.out.println("index");
	}
	else if(sol==3 || sol==7)
	{
		System.out.println("middile");
	}
	else if(sol==4 || sol==6)
	{
		System.out.println("ring");
	}
	else
	{
		System.out.println("littile");
	}
}
}