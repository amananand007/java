package org.example;

public class UniqueElementsInArray {


    public static void main(String[] args) {


        int arr[] = {1, 1, 3, 4, 5};

        int n = arr.length;

        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if (arr[i] == arr[j+1])
                    
                count = count + 1;
            }
            System.out.println(arr[i] + count);
        }

    }
}