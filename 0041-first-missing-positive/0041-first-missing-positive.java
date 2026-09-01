class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int num = 1;

        for (int i : nums) {
            if (i <= 0) {
                continue;
            }

            if (i < num) {     // skip duplicates/smaller values
                continue;
            }

            if (i == num) {
                num++;
            } else {
                return num;
            }
        }

        return num;
    }
}