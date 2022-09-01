public class NestedIfElse {
    public static void main (String [] args)
    {
        int marks = 72;
        if (marks >=33)
        {
            System.out.println("You Have Pass The EXAM !!");
            if (marks <=45)
            {
                System.out.println("Do Hard work and improve the learning ");
            }
            else if (marks <= 60)
            {
                System.out.println("You can do batter then now");
            }
            else if (marks <= 80)
            {
                System.out.println("Keep it Up");
            }            
            else 
            {
                System.out.println("Congratulations");
            }
        }
        else
        {
            System.out.println("You Fail this exam");
        }
    }
}
