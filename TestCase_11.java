package TestCases;
import java.util.*;
public class TestCase_11 {
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
		char a='A';
		int ascci1= a;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a);
			}
			a++;
			System.out.println();
		}
		}
	}
		


