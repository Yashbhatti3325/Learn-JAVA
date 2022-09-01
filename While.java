public class While {
    public static void main(String [] args)
    {
        int num = 10;
        int i = 1;
        int sum = 1;
        while(i<=num)
        {
            sum = sum * i;
            System.out.println("hello : " + i);
            i++;
        }
    }
}
