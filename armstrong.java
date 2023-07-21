import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int p=n;
int r=n;
int c=0,sum=0;
while(p!=0)
{
	p=p/10;
	c++;
}
while(n!=0)
{
	int res=0;
	res=n%10;
	sum+=Math.pow(res,c);
	n=n/10;
}
System.out.println(r);
System.out.println(sum);
if(r==sum)
{
System.out.println("armstrong");
}
else
{
System.out.println("not a armstrong");
}
}
}