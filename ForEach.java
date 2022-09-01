public class ForEach {
    public static void main(String[]args)
    {
        int arr[] = {10,20,30,40};
        String name[] = {"ram","syam","shita" , "gita"};
        // for(int i=0 ;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        for (int ele:arr)
        {
            System.out.println(ele);
        }
        for ( String eles:name)
        {
            System.out.println(eles);
        }
    }
}
