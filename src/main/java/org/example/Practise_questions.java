//package org.example;
//
// public class Practise_questions {
//
//
//     public static void main(String[] args) {
//
//        Order order = new Order(101);
//        System.out.println(order.orderId+ "-" + order.orderType);
//     }
//
//     public static class checkSubset {
//
//         public static boolean checkSubset(int[] arr1,int[] arr2){
//
//             for(int i=0;i<arr2.length;i++){
//                 boolean flag  = false;
//                 for(int j=0;j<arr1.length;j++){
//                     if(arr1[i] == arr2[j]){
//                         flag  = true;
//                         break;
//                     }
//                 }
//                 return flag;
//             }
//
//         }
//
//
//
//
//         public static void main(String args[]){
//
//             int arr1[] = {5,11,71,9,29,84};
//             int arr2[] = {777,84,5};
//
//             if (checkSubset(arr1,arr2)){
//                 System.out.println("Subset exist!");
//             } else {
//                 System.out.println("Subset dosen't exist");
//             }
//
//
//         }
//
//     }
// }
// class Order {
//     int orderId;
//     String orderType = "COD";
//
//     public Order (int orderId){
//     super();
//     this.orderId= 100;
//     orderType="UPI";
// }
//
//}