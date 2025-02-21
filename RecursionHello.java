class A
{
public void printHW( int cost)
{
if ( cost == 0 )
{
    return;
}
System.out.println ("Hello World");
printHW(cost-1);
}
}



public class RecursionHello 
{
    public static void main (String [] args)
    {
A obj = new A();
obj.printHW(5);

    }
}
