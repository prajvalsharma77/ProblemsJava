
public class Prime 
{
public static void main (String [] args)
{
 int n = 10000;
for ( int i =1 ; i<= n ; i++ )
{
boolean isPrime = true;
if( i%i == 0 && i%1 == 0)
{
if ( i==1 )
{
isPrime = false;
}
else
{
for ( int j = 2 ; j<i ; j++ )
{
if (i % j == 0) {
isPrime = false;
break;
}
}
}
if ( isPrime)
{
System.out.println (i+ " ");
}
}
}
}
}

