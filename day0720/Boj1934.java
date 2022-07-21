package day0721;

import java.util.Scanner;

public class Boj1934 { // 최소공배수
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int d = gcd(a,b);
            sb.append(a*b/d).append("\n");
        }

        System.out.println(sb);
    }

    public static int gcd(int a, int b) { //최대공약수

        while(b!=0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
