class Math_Operation
{
    public static void main(String[] args)
    {
        int a,b,sum,min,m;
        double div;
        a=20;
        b=4;
        sum=a+b;
        System.out.println(a+"+"+b+"="+sum);
        if (a>b)
        {
            min=a-b;
            System.out.println(a+"-"+b+"="+min);
        }
        else
        {
            min=b-a;
            System.out.println(b+"-"+a+"="+min);
        }
        m=a*b;
        System.out.println(a+"x"+b+"="+m);
        if(b !=0)
        {
            div=(double)a/b;
            System.out.println(a+"/"+b+"="+div);
        }
        else
        {
            System.out.println("Cannot divide by zero");
        }
    }

}