package day0717;

import java.util.Scanner;

public class Boj2562 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = 0;
        int max = 0;
        int[] arr = new int[9];

        for(int i = 0; i< arr.length; i++) {
            arr[i] = in.nextInt();
            if (arr[i]>max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);

    }
}