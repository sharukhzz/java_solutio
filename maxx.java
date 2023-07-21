import java.util.*;
class sharu
{
	static public void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		int s1 = 0, s2 = 0;
		for (int i = 0; i <= n - 1; i++)
		{
			boolean isSingleOccurrence = true;
			for (int j = i + 1; j <= n - 1; j++)
			{
				if (arr[i] == arr[j])
				{
					isSingleOccurrence = false;
					arr[i] = arr[j] = 0;
					break;
				}
			}
			if (isSingleOccurrence )
			{
				if (arr[i] > 0)
					s1 += arr[i];
				else
					s2 += arr[i];
			}
	}
	System.out.println("Maximum Difference = "
							+ Math.abs(s1 - s2));
}
}