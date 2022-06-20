public class ButterflyPattern
{
 public static void main(String[] args) 
 {
   for(int i=-3;i<=3;i++)
   {
        int num=1;                     
	for(int j=1;j<=4-Math.abs(i);j++)
	{
	  System.out.print(num);
          num++;
	}
	for(int j=1;j<=2*Math.abs(i)-1;j++)
	{
	  System.out.print(" ");
	}
        int number=1;
	for(int j=1;j<=4-Math.abs(i);j++)
	{
		if(i==0&&j==1) {
			
		}
		else {
			System.out.print(number);
	          number++;
		}
	}
	System.out.println();
   }
 }
}
