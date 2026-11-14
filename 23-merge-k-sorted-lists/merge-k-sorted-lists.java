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
        List<Integer>al= new ArrayList<>();
        for(ListNode head:lists){
            ListNode temp= head;
            while(temp!=null){
                al.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode result= new ListNode(-1);
        ListNode resulthead= result;
        Collections.sort(al);
        for(int elem:al){
            result.next=new ListNode(elem);
            result= result.next;
        }
        return resulthead.next;
    }
}