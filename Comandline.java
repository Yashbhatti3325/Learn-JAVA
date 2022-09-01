public class Comandline {
    public static void main(String[]args)
    {
        if(args.length==0)    
        System.out.println("enter value");
        for(int i=0;i<=args.length;i++)
        System.out.println("value ["+i+"]: "+args[i]);
    }
}
