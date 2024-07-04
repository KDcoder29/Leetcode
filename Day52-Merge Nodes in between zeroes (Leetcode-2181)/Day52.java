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
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        ListNode nextSum = head; 
        ListNode modify  = head;

        while(nextSum!=null){
            int sum = 0;
            while(nextSum.val!=0){
                sum=sum+nextSum.val;
                nextSum=nextSum.next;
            }
            modify.val=sum;
            nextSum=nextSum.next;
            modify.next=nextSum;
            modify=nextSum;
            
        }
    return head;
    }
}
