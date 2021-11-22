package org.example;
import java.util.*;
import java.util.Arrays;

public class LargestNo {
    public static void main(String[] args) {
        int i;
        int [] arr = new int[3];
        for(i=0;i<arr.length;i++) {
            System.out.println("Enter your  +ve integer: ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Maximum = " + arr[arr.length - 1]);
    }
}

