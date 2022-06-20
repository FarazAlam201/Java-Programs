import java.util.Scanner;
public class Seasons {

	public static void main(String[] args) {
		// Faraz Alam (13948)
		int month_num;
		String Season; 
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter the month number :");
		month_num=sc.nextInt();
		if (month_num == 12 || month_num == 1 || month_num == 2)
			Season="Winter";
		else if (month_num == 3 || month_num == 4 || month_num == 5)
			Season="Spring";
		else if (month_num == 6 || month_num == 7 || month_num == 8)
			Season="Summer";
		else if (month_num == 9 || month_num == 10 || month_num == 11)
			Season="Autumn";
		else
			Season="Invalid Input!";
		System.out.println("This month is in the "+Season+".");
	}

}
