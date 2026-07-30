class Solution {
    public int peakIndexInMountainArray(int[] a) {

        int low = 0;
        int high = a.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (a[mid] < a[mid + 1]) {
                // We are on the increasing side
                low = mid + 1;
            } 
            else {
                // We are on the decreasing side
                high = mid;
            }
        }

        return low;
    }
}
    