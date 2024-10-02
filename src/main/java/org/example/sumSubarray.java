package org.example;
import java.util.Arrays;

// Largest sum subarray of size K containing consecutive elements
public class sumSubarray {

    // Java program for the above approach

        // Function to find the largest sum
        // subarray such that it contains K
        // consecutive elements
        public static Integer maximumSum(int[] A, int N, int K)
        {

            // Stores sum of subarray having
            // K consecutive elements
            int curr_sum = 0;

            // Stores the maximum sum among all
            // subarrays of size K having
            // consecutive elements
            int max_sum = Integer.MIN_VALUE;

            // Traverse the array
            for (int i = 0; i < N - K + 1; i++) {

                // Store K elements of one
                // subarray at a time
                int[] dupl_arr = Arrays.copyOfRange(A, i, i + K);

                // Sort the duplicate array
                // in ascending order
                Arrays.sort(dupl_arr);


                // Checks if elements in subarray
                // are consecutive or not
                Boolean flag = true;

                // Traverse the k elements
                for (int j = 1; j < K; j++) {

                    // If not consecutive, break
                    if (dupl_arr[j] - dupl_arr[j - 1]
                            != 1) {
                        flag = false;
                        break;
                    }
                }

                // If flag is true update the
                // maximum sum
                if (flag) {
                    int temp = 0;

                    // Stores the sum of elements
                    // of the current subarray
                    curr_sum = 0;

                    for(int x = 0; x < dupl_arr.length; x++){
                        curr_sum += dupl_arr[x];
                    }

                    // Update the max_sum
                    max_sum = Math.max(max_sum,
                            curr_sum);

                    // Reset curr_sum
                    curr_sum = 0;
                }
            }

            // Return the result
            return max_sum;
        }

        // Driver Code
        public static void main(String args[]) {
            int[] arr = { 10, 12, 9, 8, 10, 15, 1, 3, 2 };
            int K = 3;
            int N = arr.length;
            System.out.println(maximumSum(arr, N, K));
        }

    }






