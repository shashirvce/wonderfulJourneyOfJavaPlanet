public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        int num=118,flag=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                System.out.println(num+" Is a Not A Prime Number");
                break;
            }
        }
            if(flag!=1)
                System.out.println(num+" Is A Prime Number");
    }
}
