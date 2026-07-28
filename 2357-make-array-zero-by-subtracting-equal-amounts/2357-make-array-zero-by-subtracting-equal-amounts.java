class Solution {
    public int minimumOperations(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0)
                continue;

            boolean unique = true;

            for (int j = 0; j < i; j++) {

                if (nums[i] == nums[j]) {
                    unique = false;
                    break;
                }
            }

            if (unique)
                count++;
        }

        return count;
    }
}