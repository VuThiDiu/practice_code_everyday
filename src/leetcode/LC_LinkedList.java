package leetcode;

public class LC_LinkedList {
    /* Các dạng bài về đệ quy:
    1. Đệ quy tuyến tính : Dùng có 90% các bài toán cơ bản ( duyệt, tính toán )
    2. Đệ quy ngược: Dùng cho các bài toán cần xử lý từ cuối list ( đảo ngược, truy cập ngược )
    3. Đệ quy tương hỗ: Giải quyết các bài toán phức tapk cần so sánh nhiều node
    */



    /* Easy: https://neetcode.io/problems/reverse-a-linked-list */

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

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

}
