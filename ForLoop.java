public class ForLoop {
    public static void main (String [] args )
    {
        int sum = 0;
        int num = 30 ;
        for(int i=5;i<=num; i+=5)
        {
            sum = sum+i;
            System.out.println(i);
        }
    }
}
