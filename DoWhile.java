public class DoWhile {
    public static void main (String [] args)
    {
        int sum = 0;
        int num = 10;
        int i = 1;
        do 
        {
            sum = sum + i;
            System.out.println("this is value : "+i);
            i++;
            System.out.println("This is sum "+i + " :" +sum);
        }while(i<=num);
    }
}
