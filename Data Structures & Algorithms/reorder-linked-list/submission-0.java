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
    public void reorderList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode l1 = head;
        while(l1 != null)
        {
            arr.add(l1.val);
            l1= l1.next;
        }

        int left = 0, right = arr.size()-1;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(left<right){
            temp.add(arr.get(left++));
            temp.add(arr.get(right--));
        }
        if(left == right)
        {
            temp.add(arr.get(left));
        }
        
        ListNode cur = head;
            int i=0;
            while(cur != null){
            cur.val = temp.get(i++);
            cur = cur.next;
        }

      
    }
}
