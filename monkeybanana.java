import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int b=sc.nextInt();
int p=sc.nextInt();
int tb=sc.nextInt();
int tp=sc.nextInt();
int ans=0;
ans=tb/b+tp/p;
System.out.println(n-ans);
}
}