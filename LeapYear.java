import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// Faraz Alam (13948)
		int leap_year;
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter year to check : ");
		leap_year=sc.nextInt();
		if (leap_year%4==0) {
			System.out.println("This is Leap Year");
		}
		else
		{
			System.out.println("This is not a Leap Year");
		}
	}

}
