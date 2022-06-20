import java.util.Scanner;
public class DataTypes {
	public static void main(String[] args) {
		// Faraz Alam (13948)
	    String string;
	    char character;
	    int Integer;
	    double Double;
	    float Float;    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the String : ");
	    	string=sc.nextLine();
	    System.out.println("Enter a Charactor : ");
	    	character=sc.next().charAt(0);
	    System.out.println("Enter an Integer : ");
	    	Integer=sc.nextInt();
	    System.out.println("Enter a double value : ");
	    	Double=sc.nextDouble();
	    System.out.println("Enter a Float value : ");
	    	Float =sc.nextFloat();
	    System.out.println("String : "+string);
	    System.out.println("Character : "+character);
	    System.out.println("Integer  : "+Integer);
	    System.out.println("Double  : "+Double);
	    System.out.println("Float : "+Float);
	    sc.close();
	}
}
