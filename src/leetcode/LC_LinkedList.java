package leetcode;

import java.util.List;

public class LC_LinkedList {



    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /* Các dạng bài về đệ quy:
    1. Đệ quy tuyến tính : Dùng có 90% các bài toán cơ bản ( duyệt, tính toán )
    2. Đệ quy ngược: Dùng cho các bài toán cần xử lý từ cuối list ( đảo ngược, truy cập ngược )
    3. Đệ quy tương hỗ: Giải quyết các bài toán phức tapk cần so sánh nhiều node
    */

    /* Easy: https://neetcode.io/problems/reverse-a-linked-list */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    /*Easy: https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=recursion*/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

    }


    /*post , in , pre */

    /*Easy: https://leetcode.com/problems/remove-linked-list-elements/description/?envType=problem-list-v2&envId=recursion*/
    public ListNode removeElements(ListNode head, int val) {x
        if(head == null) return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }


}
