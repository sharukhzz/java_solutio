import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=n;
int c=0,ne=0;
while(n!=0)
{
	n=n/10;
	c++;
}
int r[]=new int[c-1];
int max=0;
	int rem=0;
for(int i=0;i<r.length;i++)
{
int p=0;
while(num>10)
{
	rem=num%100;
	r[p]=rem;
	//System.out.println(r[p]);
	num=num/10;
	p++;
}
}
Arrays.sort(r);
System.out.println(r[r.length-1]);
}
}
	
	