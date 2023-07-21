import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0,rem=0;
while(i<0)
	{
	if(i==1)
	{
	c++;
	}
	else if(i>=10 && i<20)
	{
		c++;
		rem=i%10;
		if(rem==1)
		{
		c++;
		}
	}
	else{
		rem=i%10;
		if(rem==1)
		{
			c++;
		}
	}
}
System.out.println(c);
}
}
		