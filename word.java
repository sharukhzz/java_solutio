import java.util.*;
class sharu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int n=sc.nextInt();
int flag=0;
String w[]=new String[n];
for(int i=0;i<w.length;i++)
{
	w[i]=sc.next();
}
for(int i=0;i<w.length;i++)
{
	if(s.contains(w[i]))
	{
		s=s.replace(w[i]," ");
		flag=1;
	}
	else
	{
		flag=0;
		break;
	}
}
if(flag == 1)
{
System.out.println("true");
}
else{
System.out.println("false");
}
}
}


