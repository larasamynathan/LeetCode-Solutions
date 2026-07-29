class Solution {
    public int findSpecialInteger(int[] a) {

        int count = 1;

        for (int i = 1; i < a.length; i++) {

            if (a[i] == a[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count  > a.length/4) {
                return a[i];
            }
        }

        return a[0];
    }
}