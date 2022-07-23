package day0722;

import java.util.Scanner;

public class Boj4344 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int[] arr;

        for(int i = 0; i<c; i++) {

            int n = in.nextInt();
            arr = new int[n];

            double sum = 0;

            //n명 학생의 성적 입력받기
            for(int j = 0; j<n; j++) {
                int val = in.nextInt();
                arr[j] = val;
                sum+= val;
            }

            double avg = (sum/n);
            double count = 0;

            for(int j = 0; j<n; j++) {
                if(arr[j] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", (count/n)*100);

        }
        in.close();
    }
}
