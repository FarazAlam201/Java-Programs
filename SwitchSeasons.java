import java.util.Scanner;

public class SwitchSeasons {

	public static void main(String[] args) {
		// Faraz Alam (13948)
		int month_num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the month number :");
		month_num=sc.nextInt();
		switch (month_num) {
		case 12:
		case 1:
		case 2:
			System.out.println("This month is in the Winter Season.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("This month is in the Spring Season.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("This month is in the Summer Season.");
			break;	
		case 9:
		case 10:
		case 11:
			System.out.println("This month is in the Autumn Season.");
			break;
		default:
			System.out.println("Invalid Input!");
			break;	
		}
		
	}

}

