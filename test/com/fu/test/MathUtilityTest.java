/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.test;

import com.fu.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thand
 */
public class MathUtilityTest {
    
    @Test //biến hàm này thành main(), shift - F6 để chạy
    //gọi hàm getF() như thường lệ, hay hơn là tự động so sánh giùm
    //expected và actual coi có khớp nhau ko?? có thảy màu xanh
    //ko khớp nhau thảy màu đỏ. Ta chỉ nhìn màu mà ko cần mất công
    //so sánh nữa!!
    public void testFactorialRighArgumentRunsWell(){
        long expected=120; // em muốn biết 5! đúng là 120 ko
        int n=5;            //em đưa 5 đấy á
        long actual = MathUtility.getFactorial(n);  // tính thiệt coi
        // và so giùm tớ lun
        assertEquals(expected, actual); //tớ chỉ thích đèn báo giao thông thôi
    }
}
