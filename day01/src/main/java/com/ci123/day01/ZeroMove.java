package com.ci123.day01;


import java.util.Arrays;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title ZeroMove
 * @description
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @date 2019/12/27 13:56
 */
public class ZeroMove {

    private static final int arrays[] = { 0,0,1,4,52,3,0,1,0} ;

    public static void main(String[] args) {
        moveZeroes(arrays);
    }
    // 思路： 题目只要求将所有的零 移动到结尾，也就是所有不为 0 的元素 都在前面
    public static void moveZeroes(int[] nums) {
        int index = 0 ;
        for (int num : nums) {
            if (num != 0){
                nums[index++] = num ;
            }
        }
        for (; index < nums.length ; index ++){
            nums[index] = 0 ;
        }

        System.out.println(Arrays.toString(nums));
    }
}
