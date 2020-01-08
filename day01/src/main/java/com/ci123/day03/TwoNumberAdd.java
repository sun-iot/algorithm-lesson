package com.ci123.day03;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title TwoNumberAdd
 * @description
 * @date 2020/1/6 9:48
 */
public class TwoNumberAdd {

    public static void main(String[] args) {
        TwoNumberAdd twoNumberAdd = new TwoNumberAdd();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = twoNumberAdd.addTwoNumbers(l1, l2);
        System.out.println(listNode);


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode currentListNode = listNode;
        // 设置进位
        int carry = 0 ;
        while (l1 != null || l2 != null) {
            int l1_num = l1 == null ? 0 : l1.val;
            int l2_num = l2 == null ? 0 : l2.val;

            // 两个数相加,相加时跟同进位一起相加
            int sum = l1_num + l2_num + carry;
            // 拿到我们的进位值
            carry = sum / 10;
            sum %= 10;// 拿到真实值
            currentListNode.next = new ListNode(sum);
            currentListNode = currentListNode.next;
            if (l1 != null){
                l1 = l1.next ;
            }
            if (l2 != null){
                l2 = l2.next ;
            }

        }

        if (carry == 1) {
            currentListNode.next = new ListNode(1);
        }

        return listNode.next;

    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return val +"";
    }
}