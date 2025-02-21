class A 
{
    public int sum (int n)
    {
        if ( n==1)
        {
            return 1;
        }
        int sumN1 = sum (n - 1);
        int sumN = sumN1 + n;
        System.out.println(sumN);
        return sumN;
    }
}


public class RecursionNaturalSum 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.sum(50);
    }
}
