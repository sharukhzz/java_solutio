import java.util.*;
class sharu
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String t=sc.nextLine();
	String r="";
	int c=0;
	for(int i=0;i<t.length();i++)
	{
		for(int j=0;j<s.length();j++)
		{
			if(t.charAt(i) == s.charAt(j))
			{
				System.out.println(s.charAt(j));
				s.charAt(j)=' ';
				c++;
				break;
			}
		}
	}
	System.out.println(t.length()-c);
}
}
