package org.example;

public class BinarySearchAlgorithum {

    public static int binarySearch(int[] arr, int x){

        int low=0,high = arr.length-1,mid=0;

        while(low<=high){

            mid = low + (high -low) / 2;

            if (arr[mid] == x)
                return mid;

            if(arr[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;

        }

        return -1;
    }




    public static void main(String args[]){


        int arr[] = {2,3,4,5,10,20,30};
        int x =30;
        int result = binarySearch(arr,x);
        if(result == -1){
            System.out.println("Number not present");
        }
        else {
            System.out.println("Number is present at index " + result);
        }


    }
}
