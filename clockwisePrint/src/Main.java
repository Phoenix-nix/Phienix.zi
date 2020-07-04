import java.util.*;

public class Main {
    public int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        final int SIZE = m * n;
        int[] a = new int[SIZE];
        int index = 0;
        boolean[][] bool = new boolean[n][m];
        boolean right = false, left = false, up = false, down = false;
        right = true;
        int i = 0, j = 0;
        while (index < SIZE) {
            if (right == true) {
                if ( j < m && bool[i][j] == false) {
                    a[index++] = mat[i][j];
                    bool[i][j] = true;
                    j++;
                } else {
                    j--;
                    right = false;
                    i++;
                    down = true;
                }
            }
            if (down == true) {
                if ( i < n &&bool[i][j] == false) {
                    a[index++] = mat[i][j];
                    bool[i][j] = true;
                    i++;
                } else {
                    i--;
                    down = false;
                    j--;
                    left = true;
                }
            }
            if (left == true) {
                if ( j >= 0 &&bool[i][j] == false ) {
                    a[index++] = mat[i][j];
                    bool[i][j] = true;
                    j--;
                } else {
                    j++;
                    left = false;
                    i--;
                    up = true;
                }
            }
            if (up == true) {
                if ( i >= 0 && bool[i][j] == false) {
                    a[index++] = mat[i][j];
                    bool[i][j] = true;
                    i--;
                } else {
                    i++;
                    up = false;
                    j++;
                    right = true;
                }
            }
        }
        return a;
    }

}