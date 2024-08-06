import java.util.*;
class Calculator
{
    int add(int a,int b)
    {
        return a+b;
    }
    int subtract(int a,int b)
    {
        if (a>b)
        {
            return a-b;
        }
        else{
            return b-a;
        }
    }
    int multiply(int a,int b)
    {
        return a*b;
    }
    double divide(int a,int b)
    {
        if(b!=0)
        {
            return (double)a/b;
        }
        else
        {
            return 0.0;
        }
    }
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x=sc.nextInt();
        y=sc.nextInt();
        Calculator c=new Calculator();
        System.out.println("Sum ="+c.add(x,y));
        System.out.println("Difference ="+c.subtract(x,y));
        System.out.println("Product ="+c.multiply(x,y));
        System.out.println("Quotient ="+c.divide(x,y));
        sc.close();
    }
}
