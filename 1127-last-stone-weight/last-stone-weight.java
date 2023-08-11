class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> unmodifiableList = Arrays.stream(stones).boxed().toList();
        List<Integer> l = new ArrayList<Integer>(unmodifiableList);
        int x, y;
        while (l.size() > 1) {
            y = Collections.max(l);
            l.remove(l.indexOf(y));
            x = Collections.max(l);
            l.remove(l.indexOf(x));
            if (y - x > 0)
                l.add(y - x);
        }
        return l.size() == 0 ? 0 : l.get(0);
    }
}