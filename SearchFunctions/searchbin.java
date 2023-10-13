import java.util.*;
public class searchbin {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int ele=2;
        Arrays.sort(arr);

        System.out.println("The element is found at "+Arrays.binarySearch(arr,ele));
    }
    
}
