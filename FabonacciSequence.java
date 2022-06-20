import java.util.Scanner;
public class FibonacciSequence {
	public static void main(String[] args) {
		// TODO Faraz Alam (13948)
		Scanner sc=new Scanner(System.in);
		int i,x=1,y=1,z=0,n;
		System.out.print("Enter the range : ");
		n=sc.nextInt();
		System.out.print(x);
		System.out.print(" "+y);
		for(i=0;i<n-2;i++) {
		z=x+y;
		x=y;
		y=z;
		System.out.print(" "+z);
		}
		System.out.println();
		System.out.print(n+"th number of the series is: "+z);
		}
	}


