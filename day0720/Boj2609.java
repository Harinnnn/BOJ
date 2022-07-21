package day0721;

import java.util.Scanner;

public class Boj2609 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int gcd =gcd(a,b); //최소공약수
        int lcm = a*b/gcd; //최대공배수

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b) {
        while(b!=0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
