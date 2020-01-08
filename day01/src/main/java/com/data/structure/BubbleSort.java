package com.data.structure;

import java.util.Arrays;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title BubbleSort
 * @description 冒泡排序
 * @date 2020/1/8 11:39
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] data = { 9, -16, 21, 23, -30, -49, 21, 30, 30 };
        int[] data2 = { 3,6,4,2,10,11,5} ;

        System.out.println("排序之前:\n" + java.util.Arrays.toString(data));

        bubbleSort(data);

        System.out.println("排序之后:\n" + java.util.Arrays.toString(data));

    }
    public static void bubbleSort(int[] data){
        int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            boolean flag = false ;
            for (int j = 0; j < length - 1 - i ; j++) {
                if (data[j] > data[j+1]){
                    int temp = data[j+1] ;
                    data[j +1 ] = data[j] ;
                    data[j] = temp ;
                    flag = true ;
                }
            }
            if (!flag){
                break;
            }
            System.out.println("第" + (i +1) + "次排序: " + Arrays.toString(data));
        }
    }
}
