import java.util.*;
class sharu
{
	static public void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[j]);
			}
		}
	}
}