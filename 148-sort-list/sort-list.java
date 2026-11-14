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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode middle = findMiddle(head);
        ListNode lefthead=head;
        ListNode righthead=middle.next;
        middle.next=null;
        lefthead=sortList(lefthead);
        righthead=sortList(righthead);
        return mergeTwoList(lefthead,righthead);
        }
        ListNode findMiddle(ListNode node){
            ListNode fast= node;
            ListNode slow=node;
            fast=fast.next.next;
            if(node==null||node.next==null)
            return node;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        ListNode mergeTwoList(ListNode lefthead,ListNode righthead){
            ListNode dummy= new ListNode(-1);
            ListNode mergedHead= dummy;
            while(lefthead!=null&&righthead!=null){
                if(lefthead.val<=righthead.val){
                    dummy.next= lefthead;
                    lefthead=lefthead.next;
                }
                else{
                    dummy.next=righthead;
                    righthead=righthead.next;
                }
                dummy=dummy.next;
            }
            if(lefthead==null){
                dummy.next=righthead;
            }
            else
                dummy.next=lefthead;
        
            return mergedHead.next;
        }
}