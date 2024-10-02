package org.example;

import java.util.Arrays;

public class rough2 {

    public static Integer maximumSum(int A[], int N, int k){

        int curr_sum = 0;
        int max_sum=Integer.MIN_VALUE;

        for(int i=0;i<N-k+1;i++){

            int[] dup_arr = Arrays.copyOfRange(A,i ,i+k);

            Arrays.sort(dup_arr);

            Boolean flag = true;

            for(int j=1;j<k;j++){
                if(dup_arr[j] - dup_arr[j-1] != 1 ){
                    flag = false;
                    break;
                }
            }

            if(flag){

                curr_sum = 0;

                for(int x=0;x<dup_arr.length;x++){
                    curr_sum= curr_sum+dup_arr[x];
                }

                max_sum = Math.max(max_sum,curr_sum);

                curr_sum=0;
            }
        }


        return max_sum;
    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 9, 8, 10, 15, 1, 3, 2};
        int n = arr.length;
        int k = 3;
        System.out.println(maximumSum(arr,n,k));

    }
}