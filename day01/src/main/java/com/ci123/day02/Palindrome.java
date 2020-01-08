package com.ci123.day02;

import java.util.Arrays;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title Palindrome
 * @description 回文数的判定
 * @date 2020/1/3 16:50
 */
public class Palindrome {


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome() ;
        System.out.println(palindrome.isPalindrome(9));
    }

    public  boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        char[] chars = value.toCharArray();
        if (chars.length <=0){
            return false ;
        }
        if (chars.length <=1){
            return true ;
        }

        int i = 0 , j =chars.length - 1 ;

        while (i <= j){
            if (chars[++i] != chars[--j]){
                return false ;
            }
        }
        return true ;
    }



    /**
    public  boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = reverse(x, 0);

        if (x == reverse) {
            return true;
        }


        return false;
    }

    public  int reverse(int num, int result) {
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
     **/
}
