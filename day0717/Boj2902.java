package day0717;

import java.util.Scanner;

public class Boj2902 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String result = "";
            String[] str = in.next().split("-");

            for(String s:str) result+= s.charAt(0);
            System.out.println(result);
        }
}
