public class Array {
    public static void main (String [] args)
    {
        int Marks[] = {10,50};
        
        //method 2 :
        // int Marks[] = new int[5];
        //float hight[];
        // Marks[0]=10;
        // Marks[1]=20;
        // Marks[2]=30;
        // Marks[3]=40;
        // Marks[4]=50;
        int sum = 0,count = 0;

        for (int i=0;i<Marks.length;i++)
        {
            sum = sum + Marks[i];
            System.out.println(Marks[i]+ " " );
            if(Marks[i] <= 10)
            {
                System.out.println("you have soo many low marks less then "+ 30 + " tray again and get beetter result");
                count++;
            }
        }
        System.out.println(count);
        System.out.println("Total of all marks are : "+sum);
    }
}
