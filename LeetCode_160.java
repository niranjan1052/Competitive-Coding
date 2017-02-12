/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode current1 = headA;
        ListNode current2 = headB;
        int count1 =0;
        ListNode small,large;
        int count2=0;
        //find length of list1
        while(current1!=null){
            count1++;
            current1=current1.next;
        }
        //find length of list2
        while(current2!=null){
            count2++;
            current2=current2.next;
        }
        if(count1>=count2) 
            {small=headB; large=headA;} 
        else {small=headA;large=headB;} 
        int diff = Math.abs(count1-count2);
        System.out.print(diff);
        //resent the larget list so that both align at similar starting point
        while(diff-->0){
         large=large.next;   
        }
        //traverse both and check if they intersect
        while(small!=null|| large!=null){
            if(small==large){
                return small;
            }
            small=small.next;
            large= large.next;
            
        }
        return null;
           
    }
}