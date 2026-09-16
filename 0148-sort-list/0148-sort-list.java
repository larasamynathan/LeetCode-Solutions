// 
class Solution {
    
    public ListNode sortList(ListNode head) {
        
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        ListNode mid = getMid(head);

        // Split the list
        ListNode midNext = mid.next;
        mid.next = null;

        // Sort left and right parts
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);

        // Merge
        return merge(left, right);
    }

    // Find middle node
    ListNode getMid(ListNode node) {
        
        ListNode slow = node;
        ListNode fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge two sorted lists
    ListNode merge(ListNode left, ListNode right) {
        
        if (left == null) {
            return right;
        }

        if (right == null) {
            return left;
        }

        if (left.val < right.val) {
            left.next = merge(left.next, right);
            return left;
        } 
        else {
            right.next = merge(left, right.next);
            return right;
        }
    }
}