/**class MinStack {

    //can I just use the Stack class?
    Stack<Integer> s;

    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        int min = s.peek();
        for (Integer i : s) {
            if (i < min)
                min = i;
        }

        return min;
    }
}

*/

class MinStack {

    private class Node {

        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;

    public MinStack() {}

    public void push(int val) {
        if (head == null) {
            head = new Node(val, null);
        } else {
            head = new Node(val, head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        int min = head.val;
        Node n = head.next;
         while (n != null) {
            if (n.val < min)
                min = n.val;
            n = n.next;
        }

        return min;
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */