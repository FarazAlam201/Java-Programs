import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the range to generate the pattern : ");
		n=sc.nextInt();
		for(int i=0 ; i<n ; i++ )
		{
			System.out.println(" ");
			for(int j=0; j<=(n-i); j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=(i); j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
