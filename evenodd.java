import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the range to generate the pattern : ");
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("The number "+n+" is even");
		
				
		}
		else {
		System.out.println("This number is odd");
	}
	}
}