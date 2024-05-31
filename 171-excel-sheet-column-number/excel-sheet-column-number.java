class Solution {
    public int titleToNumber(String columnTitle) {
        int total = 0, pointer = 0;
        for (int i = columnTitle.length() - 1; i > 0; i--) {
            total += charVal(columnTitle, pointer) * Math.pow(26, i);
            pointer++;
        }
        total += charVal(columnTitle, columnTitle.length() - 1);
        return total;
    }
    public int charVal(String columnTitle, int index) {
        return columnTitle.charAt(index) - 64;
    }
}