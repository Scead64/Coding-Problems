package AddTwoNumbers;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class Tester {

    
    /*
     * Tests for AddTwoNumbers solution
     */
    @Test
    void multiDigitAdd() {
        ListNode node1 = ListNode.constructNum("354");
        ListNode node2 = ListNode.constructNum("521");
        ListNode expectedsolution = ListNode.constructNum("875");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void multiDigitAddCarries() {
        ListNode node1 = ListNode.constructNum("354");
        ListNode node2 = ListNode.constructNum("870");
        ListNode expectedsolution = ListNode.constructNum("1224");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void testSingleDigitAdd() {
        ListNode node1 = ListNode.constructNum("3");
        ListNode node2 = ListNode.constructNum("5");
        ListNode expectedsolution = ListNode.constructNum("8");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void testSingleDigitAddCarry() {
        ListNode node1 = ListNode.constructNum("3");
        ListNode node2 = ListNode.constructNum("8");
        ListNode expectedsolution = ListNode.constructNum("11");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void testBothZeroAdd() {
        ListNode node1 = ListNode.constructNum("0");
        ListNode node2 = ListNode.constructNum("0");
        ListNode expectedsolution = ListNode.constructNum("0");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void testOneZeroAdd() {
        ListNode node1 = ListNode.constructNum("0");
        ListNode node2 = ListNode.constructNum("1111");
        ListNode expectedsolution = ListNode.constructNum("1111");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void testVariedLengthAdd() {
        ListNode node1 = ListNode.constructNum("12");
        ListNode node2 = ListNode.constructNum("1111");
        ListNode expectedsolution = ListNode.constructNum("1123");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }

    @Test
    void testVariedLengthAddCarry() {
        ListNode node1 = ListNode.constructNum("5432");
        ListNode node2 = ListNode.constructNum("6889");
        ListNode expectedsolution = ListNode.constructNum("12321");
        ListNode solution = Solution.addTwoNumbers(node1, node2);
        while((expectedsolution != null) || (solution != null)){
            assertEquals(expectedsolution.val, solution.val);
            expectedsolution = expectedsolution.next;
            solution = solution.next;
        }
    }
}
