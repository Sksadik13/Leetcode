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
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists==null||lists.length==0)
        return null;
    ListNode head =lists[0];
    for(int i = 1;i<lists.length;i++){
         head=Merge(head,lists[i]);
    }
    return head;
    }
    ListNode Merge(ListNode list1,ListNode list2){
        ListNode dummy =new ListNode(-1);
        ListNode rhead= dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                dummy.next=list1;
                list1=list1.next;
            }
            else{
                dummy.next=list2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        if(list1==null){
            dummy.next=list2;
        }
        else
            dummy.next=list1;
        return rhead.next;
    }
}