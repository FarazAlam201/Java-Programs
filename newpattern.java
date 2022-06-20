package prascticeday;
import java.util.Scanner;

public class newpattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range of pattern :  ");
		int x =sc.nextInt();
		for (int i=0; i<x;i++) {
			for (int j=0; j<=i;j++ ){
				System.out.print("* ");
					}
			System.out.println(" ");
		}
    }
}