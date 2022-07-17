package day0717;

import java.util.Scanner;

public class Boj2743 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        int count = 0;

        for(int i = 0; i<w.length(); i++) {
            count++;
        }
        System.out.println(count);

    }
}