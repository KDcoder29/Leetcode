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
    public boolean isPalindrome(ListNode head) {
    if(head==null || head.next==null){
        return true;
    }

    ListNode slow = head;
    ListNode fast = head;

    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }

    ListNode secondHalf = reversell(slow.next);
    slow.next=null;
    ListNode l1=head;
    ListNode l2=secondHalf;

    while(l2!=null){
        if(l1.val!=l2.val){
            return false;
        }
        l1=l1.next;
        l2=l2.next;
    }
    return true;
        
    }
    public static ListNode reversell(ListNode head){
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode currp1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currp1;
        }
        return prev;
    }
}
