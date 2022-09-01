public class Break {
    public static void main (String [] arge)
    {
        int num  = 100 ;
        for (int i = 1; i <= num ; i++)
        {
            if (i == 40)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Just come out of loop ");
    }
}
