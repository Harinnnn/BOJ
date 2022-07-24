package day0723;

import java.util.Scanner;

public class Boj4673 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean[] check = new boolean[1001];

        for(int i = 1; i<1001; i++) {
            int n = d(i);
            if(n<=1000) { //1000 넘으면 거르기
                check[n] = true;
            }
        }

        for(int i = 1; i<1001; i++) {
            if(!check[i]) {
                System.out.println(check[i]);
            }
        }

    }



    public static int d(int n) {
        int sum = n;

        while(n!=0) {
            sum += n%10;
            sum /=10;
        }
        return sum;
    }

}
