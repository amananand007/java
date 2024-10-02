package org.example;

public class SumZero1 {

    static void sumZero(int[] arr){

        boolean found = false;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    if((arr[i] + arr[j]) == 0){
                        System.out.println(arr[i] + " " + arr[j]);

                }
            }
        }

    }
    
    public static void main(String[] args){
        
        int arr[]={-2,-1,0,1,2};
        sumZero(arr);
        
    }
}



