import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int n1=sc.nextInt();
int a1[]=new int[n1];
for(int i=0;i<n1;i++)
{
	a1[i]=sc.nextInt();
}
/*int n2=sc.nextInt();
int a2[]=new int[n2];
for(int i=0;i<n2;i++)
{
	a2[i]=sc.nextInt();
}*/
int mov=a1[0];
int c=0,x=0;
while(c<=a1.length)
{
while(mov!=0)
{
	c++;
	if(c==a1.length)
	{
	break;
	}
	mov--;
}
x++;
mov=a1.length-a1[c];
if(c==a1.length)
{
break;	
}
}
System.out.println(x);
}
}
