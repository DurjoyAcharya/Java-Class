package arrays;
/**
 *
 * @author Durjoy_Acharya
 */
public class SelectionSort {
    //Driver code
    public static void main(String args[])
    {
        double[] list={2,9,5,4,8,1,6};
        SelectionSort.selectionSort(list);
    }   
    public static void selectionSort(double[] list){
        for(int i=0;i<list.length;i++){
            double CurrentMin=list[i];
            int CurrentMinIndex=i;
            for(int j=i+1;j<list.length;j++){
                if(CurrentMin>list[j])
                    CurrentMinIndex=j;
            }
        if(CurrentMinIndex!=i){
            list[CurrentMinIndex]=list[i];
            list[i]=CurrentMin;
        }
    }
}
}
