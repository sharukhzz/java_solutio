import java.util.*;
class sharu
{
public static void main(String args[])
{
	String s="sharu";
	String r="";
	char A[]=s.toCharArray();
	for(int i=A.length-1;i>=0;i--)
	{
		r+=A[i];
	}
	System.out.print(r);
}
}