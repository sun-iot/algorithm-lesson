package com.ci123.day02;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title Reverse
 * @description 整数的反转
 * @date 2020/1/3 16:14
 */
public class Reverse {


    public static void main(String[] args) {
        System.out.println(reverse(-230));
    }
    public static int reverse(int x) {

        return reverse(x, 0);
    }

    public static int reverse(int num, int result) {

        if (num == 0) {
            return result;
        }
        int res = num / 10;
        int single = num % 10;
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && single > 7)) {
            return 0;
        }
        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && single < -8)) {
            return 0;
        }
        result = result * 10 + single;
        return reverse(res, result);
    }
}
