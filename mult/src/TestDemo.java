import java.util.ArrayList;
public class TestDemo {
    public int[] multiply(int[] A) {
        int[] left = new int[A.length];
        left[0] = 1;
        for (int i=1; i<left.length; i++) {
            left[i] = A[i-1]*left[i-1];
        }
        int[] right = new int[A.length];
        right[right.length-1] = 1;
        for (int i=right.length-2; i>=0; i--) {
            right[i] = A[i+1]*right[i+1];
        }
        int[] B = new int[A.length];
        for (int i=0; i<B.length; i++) {
            B[i] = left[i]*right[i];
        }
        return B;
    }
}