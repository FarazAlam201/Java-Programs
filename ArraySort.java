import java.util.Arrays;  
public class ArraySort {

	public static void main(String[] args) {
		// Faraz Alam (13948)
		int [] arr = new int [] {90, 23, 5, 109, 12, 22, 67, 34};    
		Arrays.sort(arr);   
		System.out.println("Elements of array sorted in ascending order: ");   
		for (int i = 0; i < arr.length; i++)   
		{       
		System.out.println(arr[i]);   
		}   

	}

}

