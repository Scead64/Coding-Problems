package HELPER_CLASSES;

public class ListNode{
    public int val;  
    public ListNode next;
  
    public ListNode() {  
    }

    public ListNode(int _val) {  
        this.val = _val;  
    }

    public ListNode(int _val, ListNode ln) {  
        this.val = _val; 
        this.next = ln;
    }

    // This method is for testing purposes and is not meant to be used in solution
    public static ListNode constructNum(String num){
        ListNode start = new ListNode();
        ListNode current = start, end = start;

        while(num.length() > 0){
            int digit = Integer.parseInt(num.substring(num.length() - 1, num.length()));
            current.val = digit;
            num = num.substring(0, num.length() - 1);
            ListNode tmp = new ListNode();
            current.next = tmp;
            end = current;
            current = tmp;
        }
        end.next = null;
        return start;
    }
}