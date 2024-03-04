package RemoveNthNodeFromEndOfList;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import HELPER_CLASSES.ListNode;

public class Tester {

    
    /*
     * Tests for Remove Nth Node From List solution
     */
    
    @Test
    void singleNode() {
        ListNode node = ListNode.constructNum("3");
        int numToRemove = 1;
        ListNode expectedsolution = null;
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        assertEquals(expectedsolution, solution);
    }

    @Test
    void doubleNodeRemoveStart() {
        ListNode node = ListNode.constructNum("34");
        int numToRemove = 2;
        ListNode expectedsolution = ListNode.constructNum("3");
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void doubleNodeRemoveEnd() {
        ListNode node = ListNode.constructNum("34");
        int numToRemove = 1;
        ListNode expectedsolution = ListNode.constructNum("4");
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void multiNodeRemoveEnd() {
        ListNode node = ListNode.constructNum("123456789");
        int numToRemove = 1;
        ListNode expectedsolution = ListNode.constructNum("23456789");
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void multiNodeRemoveStart() {
        ListNode node = ListNode.constructNum("123456789");
        int numToRemove = 9;
        ListNode expectedsolution = ListNode.constructNum("12345678");
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void multiNodeRemoveSecond() {
        ListNode node = ListNode.constructNum("123456789");
        int numToRemove = 8;
        ListNode expectedsolution = ListNode.constructNum("12345679");
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void multiNodeRemoveSecondFromEnd() {
        ListNode node = ListNode.constructNum("123456789");
        int numToRemove = 2;
        ListNode expectedsolution = ListNode.constructNum("13456789");
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void multiNodeRemoveMiddle() {
        ListNode node = ListNode.constructNum("123456789");
        int numToRemove = 5;
        ListNode expectedsolution = ListNode.constructNum("12346789");
        ListNode solution = Solution.removeNthFromEnd(node, numToRemove);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }
}
