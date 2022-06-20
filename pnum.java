import java.util.Scanner;
public class pnum { 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x;
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer : ");
    int num=sc.nextInt();
    for (int i=2;i<num;i++) {
    	x=0;
    	for(int j=2;j<i;j++)
    	{
    		if(i%j==0)
    			x=1;
    	}
    	
    	if(x==0)
    		System.out.println(i);
    	
    	}
    }

}
