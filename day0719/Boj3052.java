package day0719;

import java.util.HashSet;
import java.util.Scanner;

public class Boj3052 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0; i<10; i++) {
            h.add(in.nextInt()%42);
            //입력받은 값을 add 메소드를 사용해 HashSet에 저장
        }

        in.close();
        System.out.println(h.size());
    }
}
