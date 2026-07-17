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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode t1 = list1;
        ListNode t2 = list2;

        while(t1!=null)
        {
            arr.add(t1.val);
            t1 = t1.next;
        }

        while(t2!=null)
        {
            arr.add(t2.val);
            t2 = t2.next;
        }

        Collections.sort(arr);

        ListNode head = new ListNode(arr.get(0));
        ListNode node = head;

        for(int i=1; i<arr.size(); i++)
        {
            node.next = new ListNode(arr.get(i));
            node = node.next;
        }
        return head;
    }
}