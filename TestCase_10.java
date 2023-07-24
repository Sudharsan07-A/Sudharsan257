package TestCases;
import java.util.*;
public class TestCase_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n=s.nextInt();
		int i, j;       
		for (i=0; i<n; i++)   
			{  
			for (j=n-i; j>1; j--)   
			{  
				System.out.print(" ");   
			}     
			for (j=0; j<=i; j++ )   
			{    
				System.out.print("* ");   
			}   
		System.out.println();  

			}

}
}