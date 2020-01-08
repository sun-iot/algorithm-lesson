package com.data.structure;

import java.util.Arrays;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title InsertionSort
 * @description
 * @date 2020/1/8 15:31
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
        System.out.println("排序之前:\n" + java.util.Arrays.toString(data));
        int[] sort = insertSort(data);
        System.out.println("排序之后:\n" +Arrays.toString(sort));
    }

    private static int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int indx = 0;
            boolean flag = false ;
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    indx = j - 1;
                }else {
                    break;
                }
                arr[indx] = temp;
                System.out.println("第" + (i) + "-" + j + "次排序: " + Arrays.toString(arr));
            }

            System.out.println("第" + (i) + "次排序: " + Arrays.toString(arr));

        }
        return arr;
    }
}
