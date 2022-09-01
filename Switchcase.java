public class Switchcase {
    public static void main(String [] args )
    {
        int value = 10;
        switch(value)
        {
            case 1:
            {
                System.out.println("value is not found");
                break;
            }
            case 50 :
            {
                System.out.println("valu is correct ");
                break;
            }
            case 3 :
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            case 10 :
            case 11:
            {
                System.out.println("nothing");
                break;
            }
            default :
            {
                System.out.println("ther is nothing to mach");
                break;
            }
        }
    }
}
