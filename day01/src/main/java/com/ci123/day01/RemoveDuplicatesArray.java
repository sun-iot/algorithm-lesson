package com.ci123.day01;

import java.util.Arrays;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title RemoveDuplicatesArray
 * @description 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * @date 2019/12/27 9:15
 */
public class RemoveDuplicatesArray {

    private static final int[] arrays = {1, 1, 2, 3, 6, 5, 4, 4, 5, 5, 8, 4};

    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        // 在一个数组内做运算，不得开辟新的空间
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return 1;
        }
        // 定义两个指针，分别是前置指针和后置指针，用于标记位置
        int index_p = 0, index_q = 1;
        // 开始对整个数组进行遍历
        int array_length = nums.length;
        while (index_q < array_length) {
            // 先判断两个 index_p , index_q 位置上的元素是否一致)
            if (nums[index_p] == nums[index_q]) {
                // 将 index_q 后置指针往后移动一位
                // 这一步放在外边

            } else {
                // 如果不相等的话，就把 index_q 位置上的元素 复制到 index_p + 1 位置上，
                nums[index_p + 1] = nums[index_q];
                // 然后在吧 index_p , index_q 位置往后挪一位

                index_p++;
            }
            index_q++ ;
        }
        return index_p + 1;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(arrays));
    }
}
