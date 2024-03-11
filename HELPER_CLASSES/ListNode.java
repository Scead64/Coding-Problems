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

    // These methods are for testing purposes and is not meant to be used in solution
    public static ListNode constructListByNum(String num){
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

    public static ListNode constructListOrder(int length, int[] orders, int[] values){
        ListNode[] nodes = new ListNode[length];
        for(int i = 0; i < length; i++){
            nodes[i] = new ListNode(values[i]);
        }

        for(int j = 0; j < length; j++){
            if(orders[j] == -1){
                nodes[j].next = null;
            } else {
                nodes[j].next = nodes[orders[j]];
            }
        }
        
        return nodes[0];
    }
}