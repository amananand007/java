package JavaCollection;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ListDemoRemove {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

         for(int i=0;i<5;i++){
             list.add(i);
         }
        System.out.println("List :" + list);
        System.out.println("Enter the index to remove");

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        if (index <= list.size()-1){
            list.remove(index);
            System.out.println("List is " + list);
        }
        else {
            System.out.println("Error: No such index found...");
        }

        System.out.println("Enter the element to check");

        int ele = sc.nextInt();
        if(list.contains(ele)){
            System.out.println("Yes we have");
        } else {
            System.out.println("Error: No such element found");
        }

        System.out.println(list.indexOf(ele));
    }
}
