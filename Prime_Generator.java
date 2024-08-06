class Prime_Generator 
{
    public static void main(String[] args) 
    {
        int i,j,c;
        String prime="";
        System.out.println("Printing all prime numbers between 1 and 100:");
        for(i=1;i<=100;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                prime=prime+i+" ";
            }
        }
        System.out.println("Prime no. generated from 1 to 100 are:-");
        System.out.println(prime);
    }
}