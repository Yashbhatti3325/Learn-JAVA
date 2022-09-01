public class conditionalOperator {
    public static void main(String [] arge)
    {
        int a = 77,b = 10,c = 20,max;
        max = (a>b)?(a>c)?a:c:(b>c)? b:c;
        System.out.println(max);
    }
}
