package MiddleOfTheLinkedList;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import HELPER_CLASSES.ListNode;

public class Tester {

    
    /*
     * Tests for Remove Nth Node From List solution
     */
    
    @Test
    void singleNode() {
        ListNode node = ListNode.constructListByNum("3");
        ListNode expectedsolution = node;
        assertEquals(expectedsolution, Solution.middleNode(node));
    }

    @Test
    void twoNodes() {
        ListNode node = ListNode.constructListByNum("35");
        ListNode expectedsolution = node.next;
        assertEquals(expectedsolution, Solution.middleNode(node));
    }

    @Test
    void threeNodes() {
        ListNode node = ListNode.constructListByNum("354");
        ListNode expectedsolution = node.next;
        assertEquals(expectedsolution, Solution.middleNode(node));
    }
  
}
