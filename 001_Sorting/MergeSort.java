import java.util.ArrayList;
import java.util.List;

public class Solution {

    static void merge(int arr[], int low, int mid,  int high){

        int l = low;
        int r  = mid+1;
        List<Integer> temp  = new ArrayList<>();


        while(l<=mid && r <= high){

            if( arr[l] <= arr[r]){
                temp.add(arr[l]);
                l++;
            }else{
                 temp.add(arr[r]);
                r++;
            }

        }

        while( l <= mid){
              temp.add(arr[l]);
                l++;
        }

        
        while( r <= high){
              temp.add(arr[r]);
                r++;
        }

        for(int i=low; i <=high; i++){
            arr[i] = temp.get(i - low);
        }


    }

    static void mSort(int arr[], int low, int high){

        if( low  == high) return;

        int mid = (low+high)/2;

        mSort(arr, low, mid);
        mSort(arr, mid+1, high);

        merge(arr, low, mid, high);



    }

    public static void mergeSort(int[] arr, int l, int r){
        
        mSort(arr, 0, arr.length-1);
    }
}
