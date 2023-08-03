class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0)
                moveToEnd(i, nums);
        }
    }

    private void moveToEnd(int loc, int[] nums) {
        for (int i = loc; i < nums.length - 1; i++) {
            nums[i] = nums[i+1];
            nums[i+1] = 0;
        }
    }
}