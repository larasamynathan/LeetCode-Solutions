class Solution {
    public int minimumOperations(int[] a) {

        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                continue;

            boolean found = false;

            for (int j = 0; j < k; j++) {
                if (a[j] == a[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                a[k] = a[i];
                k++;
            }
        }

        return k;
    }
}