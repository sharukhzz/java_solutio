import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int p=n;
	int c=0;
	while(n>0)
	{
		if(n%2!=0)
		{
			n=n-1;
		}
		else{
			n=n/2;
		}
		c++;
	}
	System.out.println(c);
}
}
			
		