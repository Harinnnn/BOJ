package day0723;

public class Boj15596 {

    public long sum(int[] a) {
        long sum = 0;
        for(int i = 0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
