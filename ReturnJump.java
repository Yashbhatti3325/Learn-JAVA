public class ReturnJump {
    public static int sum(int a, int b){
        if(a<b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    public static void main(String [] arge)
    {
        int a = 7 , b = 6 ;
        int ans = sum(a, b);
        System.out.println(ans);
    }
}
