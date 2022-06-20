import java.util.Scanner;
//	FARAZ ALAM (13948)
public class ExceptionHandler {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Operand:");
        int a = in.nextInt();
        System.out.println("Operator(+ - / *):");
        String operator = in.next();
        System.out.println("Operand:");
        int b = in.nextInt();
        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
