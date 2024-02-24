public class DivideEvenly 
{
    public static void main(String[] args)
    {
        final int LIMIT = 1000;
        int var;
        System.out.print(LIMIT + " is evenly divisible by ");
        for(var = 1; var <= LIMIT; ++var)
        {
            if(LIMIT % var == 0)
            {
                System.out.print(var + " ");   
            }
        }
        System.out.println();
    }
}