package org.example;

import java.util.Arrays;

public class Anagram {

static boolean areAnagram(char[] str1, char[] str2){

    int n1 = str1.length;
    int n2 = str2.length;

    if(n1 != n2)
        return false;

    Arrays.sort(str1);
    Arrays.sort(str2);

    for(int i=0;i<n1;i++){
        if(str1[i] != str2[i])
            return false;
    }

    return true;
}

public static void main(String[] args){

    char[] str1  = {'e','t','h'};
    char[] str2 = {'t','h','e'};

    if(areAnagram(str1,str2)){
        System.out.println("Is anagram true");
    }
    else {
        System.out.println("Not anagram");
      }
    }
 }
