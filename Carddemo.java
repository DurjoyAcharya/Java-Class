package arrays;

/**
 *
 * @author User
 */
public class Carddemo {
    public static void main(String...r){
    String s=Integer.toString(25);
    String i=""+4.5;
    String u = "Value = "+45;
        System.out.println(u);
             
    }
    public static double sum(double[] data){
    double total=0;
    for(double val:data)
        total+=val;
    return total;
    }
}
