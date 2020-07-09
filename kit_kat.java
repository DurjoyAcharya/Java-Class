package arrays;
/**
 *
 * @author User
 */
public class kit_kat {
    public static void main(String...r){
    int[] x={10};
    int[] y={20};
    swap(x,y);
    System.out.println("After Swap "+x[0]+" "+y[0]);
}
    public static void swap(int[] n,int[] m){
     System.out.println("Before Swap "+n[0]+" "+m[0]);
     n[0]=20;
     m[0]=10;
     System.out.println("Before Swap "+n[0]+" "+m[0]);
    }
}
