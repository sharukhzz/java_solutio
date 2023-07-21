import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int l=n-1;
int ans=0,sum=0;
int i=0;
while(n!=0)
{
ans=n%10;
//System.out.println(ans);
if(ans==1)
{
	sum+=Math.pow(2,i);
}
i++;
n=n/10;
}
System.out.println(sum);
}
}