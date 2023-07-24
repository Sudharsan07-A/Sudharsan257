package TestCases;
import java.util.*;
public class TestCase_8 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int m=n;
	int a=m;
	for (int i=1;i<=n;i++)
	{
		for (int j=1; j<=n;j++)
		{
			if(i==1)
			{
				System.out.print(j);
			}
			else if(i==n)
			{
				System.out.print(m--);
			}
			else if(j==1)
			{
				System.out.print(i);
			}
			else if(j==n)
			{
				System.out.print(--a);
			}
			else 
			{
				System.out.print(" ");
			}
		}
		System.out.println();

	}

}
}
