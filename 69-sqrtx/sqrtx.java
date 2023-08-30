class Solution {
    public int mySqrt(int x) {
        //used hint
        double curr = 0;
        double x1 = (double)x;
        while ((curr + 1)*(curr + 1) <= x1) {
            curr++;
        }

        return (int)curr;
    }
}