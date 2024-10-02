package org.example;

public class Main {

    public static void main(String[] args) {

    // distinct elements in an array

    int [] arr = {1,1,2,3,4,4,4,5};

    System.out.println("Hi there");

    distinctElements(arr);

//    System.out.println(b);

    }

    static void distinctElements(int[] arr){


        int n = arr.length;
        System.out.println(n);
            for(int i=0;i<n;i++){
                int j;
                for(j=0;j<i;j++){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
            if(i == j)    {
                System.out.print(arr[i] + " ");
            }

        }


    }
}         