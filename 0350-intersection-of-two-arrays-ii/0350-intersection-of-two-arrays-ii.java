import java.util.*;

class Solution {
    public int [] intersect(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int[] result = new int[Math.min(a.length, b.length)];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } 
            else if (a[i] > b[j]) {
                j++;
            } 
            else {
                result[k++] = a[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOf(result,k);
    }
}
