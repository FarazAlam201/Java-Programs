import java.util.Scanner;
class op
{	// Faraz Alam (13948)
    float num1,num2,sum,subs,mult,div;
    op()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1=sc.nextFloat();
        System.out.println("Enter second number : ");
        num2=sc.nextFloat();
        sc.close();
    }
    void sum()
    {
        sum=num1+num2;
        System.out.println("Sum = "+sum);
    }
    void subs()
    {
        subs=num1-num2;
        System.out.println("Substract = "+subs);
    }
    void mult()
    {
        mult=num1*num2;
        System.out.println("Product = "+mult);
    }
    void div()
    {
        if(num2==0)
        {
            System.out.println("This can't be divided");
        }
        else
        {
            div=num1/num2;
            System.out.println("Quotient = "+div);
        }
        
    }
}

public class Calc 
{
    public static void main(String[] args) 
    {
        op obj1= new op();
        obj1.sum();
        obj1.subs();
        obj1.mult();
        obj1.div();
        
        
    }    
}
