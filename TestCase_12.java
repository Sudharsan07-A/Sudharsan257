package TestCases;
import java.util.*;
public class TestCase_12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		for (int i=1; i<=n/4; i++) {
			for (int j=1; j<=n; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
