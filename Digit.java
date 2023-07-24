package day2_programs;
import java.util.*;
public class Digit {
	
	public static void main(String[] args) {
	Scanner d=new Scanner(System.in);
	System.out.println("Enter a numbers:");
	int n=d.nextInt();
	int count=0;
//	for(int i=1;i<=n;i++) 
	while(n!=0) {
		n/=10;
		count++;
	}
	System.out.print(count);
	

}
}