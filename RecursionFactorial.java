class A 
{
    public int Factorial(int n)
    {
        if ( n == 1)
        {
            return 1;
        }
        
        return Factorial(n-1)*n;
    }
}










public class RecursionFactorial 
{
    public static void main ( String [] args)
    {
A obj = new A();
System.out.println(obj.Factorial(19));
    }
}
