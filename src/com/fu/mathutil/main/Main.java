/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathutil.MathUtility;

/**
 *
 * @author thand
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1st upload from Local to GitHub!!!");
//        System.out.println("Welcom to GitHub");
        //TEST TRÂU BÒ, TỨC LÀ DÙNG MẮT ĐỂ NHÌN ĐÚNG SAI
        
        long expected= 120; //tui kì vọng hàm tính giai thừa trả về 120
        long actual;        //nếu tui đưa vào 5
        int input =5;       //đầu vào 5
        actual = MathUtility.getFactorial(input);  //xem ói ra mấy
        System.out.println("5!: Expected: "+expected+"; Actual: "+actual);
        //một test case, 1 tình huống xài hàm, test hàm, dùng hàm
        
        //case 2: 0! thì sao??
        expected = 1;
        input= 0;
        actual = MathUtility.getFactorial(input);  //xem ói ra mấy
        System.out.println("5!: Expected: "+expected+"; Actual: "+actual);
        
        //case 3: 2! thì sao??
        expected = 2;
        input= 2;
        actual = MathUtility.getFactorial(input);  //xem ói ra mấy
        System.out.println("5!: Expected: "+expected+"; Actual: "+actual);
        
        //case 3: -1! thì sao??
        //expected=??? //ngoại lệ mà, ko so sánh đc, ko phải là value
        //mà chỉ là xuất hiện thôi
        input= -1;
        actual = MathUtility.getFactorial(input);  //xem ói ra mấy
        //ko in đc ngoại lệ, chỉ coi nó xh hay ko??
        
        //CHÚNG TA PHẢI NHÌN ĐỂ KẾT LUẬN, NHÌN NHIỀU CASES
        //CHƠI TRÒ THÔNG MINH HƠN - TEST AUTOMATION DÙNG THƯ VIỆN
    }
    
}
