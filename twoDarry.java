import java.util.Random;
public class twoDarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		
		int values[][]= new int [3][4];
		
		for(int i=0;i<values.length;i++) {
			
			for(int j=0;j<values[i].length;j++) {
				
				values [i][j]= random.nextInt(100);
				System.out.print(values[i][j]+" ");
			}
				System.out.println(" ");
		}
	}

}
