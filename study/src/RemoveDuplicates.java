public class RemoveDuplicates {
    public static void main(String[] args){
        public ListNode removeDuplicates(ListNode head){
            if(head == null){
                return null
            }
            ListNode pre = head;
            while(pre.next != null){
                if(pre.val == pre.next.val){
                    pre.next = pre.next.next;
                }
                else{
                    pre = pre.next;
                }
            }
            return head;
        }
    }
}

