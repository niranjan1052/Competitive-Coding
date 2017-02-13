/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
      
        ListNode prev = head;
        ListNode current = head;
        while(current!=null){
            if(current.val==val){
                if(current ==head){
                    head = current.next;
                    prev = current;
                }
                prev.next = current.next;
                current = current.next;
            }
            else{
                    prev = current;
                    current = current.next;
                
            }
        }
        return head;
      //   if (head == null) return null;
        //head.next = removeElements(head.next, val);
        //return head.val == val ? head.next : head;
    }
}