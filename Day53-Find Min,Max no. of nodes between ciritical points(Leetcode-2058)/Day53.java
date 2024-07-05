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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        if(head.next.next==null || head.next==null){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        int startingPointer=0;
        int currPointer=0;
        int count =0;
        int prevPointer=0;
        int walkingPointer=2;
        int minDistance=Integer.MAX_VALUE;
        int maxDistance=Integer.MIN_VALUE;
        while(curr.next!=null){
            ListNode next = curr.next;
            if((curr.val<next.val && curr.val < prev.val) || (curr.val>next.val && curr.val > prev.val) ){
                if(count==0){
                    count++;
                    startingPointer=walkingPointer;
                    prevPointer=walkingPointer;
                    prev=curr;
                    curr=curr.next;
                    walkingPointer++;
                }else{
                    count++;
                    currPointer=walkingPointer;
                    int distance=currPointer-prevPointer;
                    minDistance=Math.min(distance,minDistance);
                    prevPointer=currPointer;
                    prev=curr;
                    curr=curr.next;
                    walkingPointer++;
                }
            }else{
            prev=curr;
            curr=curr.next;
            walkingPointer++;
            }
        }
        maxDistance = currPointer-startingPointer;
         if(count<2){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        ans[0] = minDistance;
        ans[1]=maxDistance;
        return ans;
    }
}
