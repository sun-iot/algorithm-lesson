package com.ci123.day03;

/**
 * @author Mr.Sun
 * @version v.1.0
 * @title PreferNumber
 * @description
 * @date 2020/1/6 9:25
 */
public class PrefectNumber {

    public static void main(String[] args) {
        PrefectNumber prefectNumber = new PrefectNumber() ;
        System.out.println(prefectNumber.checkPerfectNumber(0));
    }

    public boolean checkPerfectNumber(int number) {
        if (number == 0 ) {
            return false ;
        }
        int checkPerfectNumber = getCheckPerfectNumber(number);
        if ((checkPerfectNumber-number) == number){
            return true ;
        }
        return false;
    }

    public int getCheckPerfectNumber(int num) {
        int sum = 0 ;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0){
                int temp = num / i ;
                sum += i ;
                if (temp != i){
                    sum += temp ;
                }
            }
        }
        return sum;
    }
}
