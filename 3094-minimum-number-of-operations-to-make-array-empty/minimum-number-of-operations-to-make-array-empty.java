class Solution {
    /*
        Recursive
        How to go about not n^2log(n)
        First run - put into map of n, count
        For each, if count = 1, bail
            count / 3 + ()count % 3 != 0) ? 1 : 0
    */
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        int count = 0;
        for (int num : map.values()) {
            if (num == 1) {
                return -1;
            }
            count += opsForNums(num);
        }
        return count;
    }

    public int opsForNums(int num) {
        return (num / 3) + (num % 3 != 0 ? 1 : 0);
    }
}