public class MultiDimension {
    public static void main ( String[]args)
    {
        int num [][] = new int [3][];
        for (int i = 0; i<num.length;i++)
        {
            num[i] = new int[5];
        }
        for(int i=0;i<num.length;i++)
        {
            for(int j = 0 ; j<num[i].length;j++)
            {
                System.out.println(num[i][j] = i*j);
            }
        }
    }
}
