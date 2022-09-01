public class ForEachLoop {
    public static void main(String [] args )
    {
        int [] my_list = {10,11,12,13,14};
        for(int val:my_list)
        {
            int z = 5;
            z = val * z ;
            System.out.println(z);
            System.out.println(val);
        }
    }
}
