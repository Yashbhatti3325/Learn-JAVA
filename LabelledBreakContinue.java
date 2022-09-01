public class LabelledBreakContinue {
        public static void main (String[] args)
        {
            out:
            for (int i=1;i<=10;i++)
            {
                System.out.println("from outer :" + i);
                for (int j = 1;j<=5;j++)
                {
                    System.out.println("    from inner :" + j);
                    if( j == 2 )
                    break out;
                }
            }
        }
}
