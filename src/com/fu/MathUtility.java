/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu;

/**
 *
 * @author thand
 */
public class MathUtility {
    //đay là class mô phỏng lại class Math, chứa các hàm sài chung
    // hàm xài chung, ko lưu lại điều gì -> STATIC
    
    //hàm tính n!
    //n! tăng rất nhanh về giá trị.
    //21! tràn kiểu long, lớn hơn 18 số 0
    //bài này ta tính từ 0..20!. Âm ko tính đc, 0! = 1! =1
    public static long getFactorial(int n){
        if (n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        
        //Sống sót đến đây thì n = 0,1..20
        if (n==0|| n==1)
            return 1; //0! 1! =1
        
        long result=0; //giả bộ =0
        for (int i = 2; i < n; i++) {
            result *=i;
        }
        return result; //nhân từ 2 3 4 5 6 7 ...
    }
}
