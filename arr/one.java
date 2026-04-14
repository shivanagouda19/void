package arr;
import java.util.*;

public class one {
    public static int binarr(int arr[], int key){
        int index = 0;
        int m = arr.length/2;
        int l = 0;
        int r = arr.length-1;
        while(index<=m){
            if (key ==arr[m]){
                return m;
            }
            else if(key<arr[m]){
                r=m-1;
                m= (l+r)/2;
            }
            else if(key>arr[m]){
                l=m+1;
                m= (l+r)/2;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int arr[]= {1,2,3,4,5,6,7};
        int key = 5;
        int ans = binarr(arr,key);
        System.out.println(ans);
    }
       
}