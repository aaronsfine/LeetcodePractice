class Solution {
    public int mySqrt(int x) {
        //used hint
        int curr = 0;
        while ((double)(curr + 1)*(curr + 1) <= (double)x) {
            curr++;
        }

        return curr;
    }
}