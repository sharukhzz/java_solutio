import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ans=0;
int res=n-2;
while(n>=res)
{
	ans+=n;
	n=n-1;
}
System.out.println(ans);
}
}