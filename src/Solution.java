class Solution {
    public int majorityElement(int[] nums) {
        int value = -1;
        int checkRank = 0;
        for (int i = 0; i < nums.length; i++) {
            if (checkRank == 0) {
                value = nums[i];
                checkRank = 1;
            } else if (value == nums[i]) {
                checkRank++;
                if (checkRank > (nums.length / 2)) {
                    return value;
                }
            } else checkRank--;
        }
        return value;
    }
}
