public class GarbageCollection {
    public void finalize ()
    {
        System.out.println("object Destoryed");
    }
    public static void main(String [] args)
    {
        GarbageCollection gcd1 = new GarbageCollection();
        GarbageCollection gcd2 = new GarbageCollection();

        gcd1 = null;
        gcd2 = null;

        System.out.println("objects are null" + gcd1 + gcd2);
        System.gc();
    }
}
