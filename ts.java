import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char t=sc.next().charAt(0);
int c=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==t)
	{
		c++;
	}
}
System.out.println(c);
}
}