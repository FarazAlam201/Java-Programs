public class AverageSet {

	public static void main(String[] args) {
		// Faraz ALam (13948)
		int sum=0;
		double avg;
		int arr[]= { 4,8,3,5,9,10,7};
		for (int i=0; i<arr.length;i++)
			sum+=arr[i];
		avg=sum/arr.length;
		System.out.println("The sum o the given set is  :  "+sum);
		System.out.print("The average of given set of numbers is :  "+avg);

			}
}
