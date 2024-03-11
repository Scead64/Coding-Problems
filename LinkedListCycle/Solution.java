package LinkedListCycle;

import java.util.HashSet;

import HELPER_CLASSES.ListNode;

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
public class Solution {
    /*** SOLUTION ***
     *
     * We iterate through the list storing each node as we go, and if we ever run into a node we've stored, there is a cycle.
     * If we run into a node that leads to null, there is no cycle
     * 
     * Complexity
     * - Time complexity:
     *      O(n)
     *      where n is the number of nodes in the list
     * - Space complexity:
     *      O(n)
     *      As we may store the whole list
    */
    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        while(head != null){
            if(nodes.contains(head)){
                return true;
            } else {
                nodes.add(head);
            }
            head = head.next;
        }
        return false;
    }
    

    public static void main(String args[]){
        ListNode node = ListNode.constructListOrder(10, new int[]{1,2,3,4,5,6,7,8,9,-1}, new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.print(hasCycle(node));
    }
}
