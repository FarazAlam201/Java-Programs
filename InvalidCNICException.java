import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
 class ValidateCNIC {
   public void method() {
 String CNIC;// = "42101-9468973-2";
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter CNIC in the following pattern XXX-XXXXXXX-X");
          CNIC=sc.next();
   Pattern pattern = Pattern.compile("\\d{5}-\\d{7}-\\d{1}");
      Matcher matcher = pattern.matcher(CNIC);
      try
      {if (matcher.matches()) 
      System.out.println("CNIC Valid");
      else throw new InvalidCNICException("The CNIC you Entered is not valid");
      }
      catch(InvalidCNICException e) {
      System.out.println("The CNIC you Entered is not valid");
      }
      }
   public static void main(String[] args) {
 ValidateCNIC test = new ValidateCNIC();     
 test.method();
   }
 } 
public class InvalidCNICException extends Exception{
   public InvalidCNICException() {}
   InvalidCNICException(String s){ super(s);}}
