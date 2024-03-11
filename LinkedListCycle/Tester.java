package LinkedListCycle;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

import HELPER_CLASSES.ListNode;

public class Tester {

    
    /*
     * Tests for Remove Nth Node From List solution
     */
    
    @Test
    void singleNode() {
        ListNode node = ListNode.constructListOrder(1, new int[]{-1}, new int[]{1});
        assertFalse(Solution.hasCycle(node));
    }

    @Test
    void multipleNodesNoCycle() {
        ListNode node = ListNode.constructListOrder(10, new int[]{1,2,3,4,5,6,7,8,9,-1}, new int[]{1,1,1,1,1,1,1,1,1,1});
        assertFalse(Solution.hasCycle(node));
    }
    
    @Test
    void multipleNodesCycle() {
        ListNode node = ListNode.constructListOrder(10, new int[]{1,2,3,4,5,6,7,8,9,0}, new int[]{1,1,1,1,1,1,1,1,1,1});
        assertTrue(Solution.hasCycle(node));
    }
}
