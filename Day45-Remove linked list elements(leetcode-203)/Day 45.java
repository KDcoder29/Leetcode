class Solution {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }

    if (head.next == null) {
      return head.val == val ? null : head;
    }

    if (head.val == val) {
      head = head.next;
    }

    ListNode temp = head;
    while (temp.next != null) {
      if (temp.next.val == val) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
    }
  
    if(head.val==val){
        if(head.next==null){
        return null;
        }else{return head.next;}
    }else{
    return head;
    }
  }
}
