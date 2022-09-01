public class Copy {
    public static void main(String [] args) {
        char [] copyFrom = { 'y','a','s','h'};
        char [] copyTo = new char[3];
        System.arraycopy(copyFrom,1,copyTo,0,3);
        System.out.println(copyTo);
        
    }
}
