import java.lang.Math;
import java.util.Scanner;
public class Equation {

public static void main(String[] args) {
	// Faraz Alam (13948)
double x, equation;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
	x=sc.nextDouble();
equation=3*Math.pow(x,4)*Math.sin(180*x) + 4*Math.pow(x,3)*Math.cos(90*x) + Math.pow(x,2)*Math.sin(Math.tan(45)) + 7*x + 9*Math.cos(90*Math.pow(x,2) ) ;	
System.out.println("The result of the equation is : "+equation);
	
	}
}

