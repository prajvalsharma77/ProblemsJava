public class Pyramid1
{
    public static void main(String[] args) 
    {
        int n = 10;
        for ( int i = 1 ; i<= n ; i++ )
        {
            for ( int j = 1 ; j<=i ; j++)
            {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
