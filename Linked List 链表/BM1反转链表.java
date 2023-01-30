/* Problem description
描述

给定一个单链表的头结点pHead(该头节点是有值的，比如在下图，它的val是1)，长度为n，反转该链表后，返回新链表的表头。

数据范围： 
0≤n≤1000
0≤n≤1000
要求：空间复杂度 O(1), 时间复杂度 O(n)。

如当输入链表{1,2,3}时，
经反转后，原链表变为{3,2,1}，所以对应的输出为{3,2,1}。
*/

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return head;
        }
        return reverse(head, null);
    }

    public ListNode reverse (ListNode head, ListNode previous){
        if(head != null){
            ListNode nextNode = head.next;
            head.next = previous;
            return reverse(nextNode, head);
        }
        return previous;
    }
}
