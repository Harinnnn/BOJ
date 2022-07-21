package day0721;

import java.util.Scanner;

public class Boj13241 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();

        long gcd = gcd(Math.max(a,b), Math.min(a,b));

        System.out.println((a*b)/gcd);
    }

    public static long gcd(long a, long b) {

        while(b!=0) {
            long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
