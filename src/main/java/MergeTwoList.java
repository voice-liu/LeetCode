public class MergeTwoList {


    /**
     * 21. 合并两个有序链表<br/>
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。<br/>
     *
     *<a href="https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg">https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg</a><br/>
     *
     * 示例 1：<br/>
     * 输入：l1 = [1,2,4], l2 = [1,3,4]
     * 输出：[1,1,2,3,4,4]
     *<br/>
     * 示例 2：<br/>
     * 输入：l1 = [], l2 = []
     * 输出：[]
     *<br/>
     * 示例 3：<br/>
     * 输入：l1 = [], l2 = [0]
     * 输出：[0]
     *<br/>
     * 提示：<br/>
     * 两个链表的节点数目范围是 [0, 50]
     * -100 <= Node.val <= 100
     * l1 和 l2 均按 非递减顺序 排列
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {



        return null;
    }
}
