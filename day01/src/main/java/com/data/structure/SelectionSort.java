package com.data.structure;

import java.util.Arrays;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title SelectionSort
 * @description
 * @date 2020/1/8 14:16
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
        int[] data2 = { 3,6,4,2,10,11,5} ;

        System.out.println("排序之前:\n" + java.util.Arrays.toString(data));

        selectSort(data);

        System.out.println("排序之后:\n" + java.util.Arrays.toString(data));
    }

    public static void selectSort(int[] data){
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            boolean flag = false ;
            for (int j = i+1 ; j < length ; j ++){
                if (data[i] > data[j]){
                    int temp = data[i] ;
                    data[i] = data[j] ;
                    data[j] = temp ;
                    flag = true ;
                }
                System.out.println("第" + (i+1) + "-" + j + "次排序: " + Arrays.toString(data));
            }
            if (!flag){
                break;
            }
            System.out.println("第" + (i+1) + "次大排序: " + Arrays.toString(data) + "\n");
        }
    }
}
