package arrays;

/**
 *
 * @author Durjoy_Acharya
 */
public class LinearSearch {
    public static void main(String args[]){
        int[] a={3,5,4,7,8,6,4,5,4,5,4,1};
        int lock=8;
        int b=LinearSearch(a,7);
        System.out.println(b);
        
    }
    public static int LinearSearch(int[] list,int key){
        int i=0;
        for(i=0;i<list.length;i++){
            if(key==list[i]){
                key=list[i];
            }
            return i;
        }
        return -1;
    }    
}
