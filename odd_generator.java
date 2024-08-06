class odd_generator
{
    public static void main(String[] args)
    {
        int i;
        System.out.println("Odd numbers between 1 and 100:");
        for(i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
