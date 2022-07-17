package day0717;

import java.util.Scanner;

public class Boj1157 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[26];
        String s = in.next();

        int max = -1;
        char index = '?';

        for(int i = 0; i<s.length(); i++) {
            if(65<=s.charAt(i) && 90>= s.charAt(i)) {
                arr[s.charAt(i)-65]++;
            }
            if(97<=s.charAt(i) && 122>=s.charAt(i)) {
                arr[s.charAt(i) - 97]++;
            }
        }

        for(int i=0; i<26;i++) {
            if(max<arr[i]){
                max = arr[i];
                index = (char) (i+65);
            }
            else if(max==arr[i]) {
                index = '?';
            }
        }

        System.out.println(index);
    }
}