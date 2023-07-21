import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ti=sc.nextInt();
int to=sc.nextInt();
int r=sc.nextInt();
int ai[]=new int[ti];
int ao[]=new int[to];
for(int i=0;i<ti;i++)
{
	ai[i]=sc.nextInt();
}
for(int j=0;j<to;j++)
{
	ao[j]=sc.nextInt();
}
int sumi=0;
for(int i=0;i<ti;i++)
{
	sumi+=ai[i];
}
int sumo=0;
for(int j=0;j<to;j++)
{
	sumo+=ao[j];
}
int ans=sumi-sumo;
int res=(ans+r);
System.out.println(-res);
}
}