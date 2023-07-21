import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String goal=sc.nextLine();
int l1=s.length();
int l2=goal.length();
int count=0;
int j=l2-1;
for(int i=0;i<l1;i++)
{
	if(s.charAt(i) == goal.charAt(j))
		count=count+1;
	j--;
}
if(count > 0)
System.out.println("true");
else
System.out.println("false");
}
}		