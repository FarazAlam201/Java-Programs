import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// Faraz Alam (13948)
		Scanner input=new Scanner(System.in);
		String Word,Check = "";
		System.out.print("Enter a word to check if it is Palindrome : ");
		Word=input.nextLine();
		input.close();
		for(int i=Word.length()-1;i>=0;i--) {
			Check = Check + Word.charAt(i);
		}
		if(Word.equalsIgnoreCase(Check))
		{
			System.out.print("This is a Palindrome word ");
		}
		else 
		{
			System.out.print("This  is not a Palindrome word");
		}
		
	}

}
