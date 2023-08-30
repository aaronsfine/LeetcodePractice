/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode currNode = head;
        while(currNode != null) {
            nodes.add(currNode);
            currNode = currNode.next;          
        }

        if (nodes.size() == n) {
            return nodes.get(0).next;
        } else {
            currNode = nodes.get(nodes.size() - n - 1);
            currNode.next = currNode.next.next;
            return nodes.get(0);
        }
    }
}