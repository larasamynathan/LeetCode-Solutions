class Solution {
    public char nextGreatestLetter(char[] a, char target) {

        int start = 0;
        int end = a.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (a[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        
        if (start == a.length) {
            return a[0];
        }

        return a[start];
    }
}
