package com.fu.mathutil.test;

import com.fu.mathutil.MathUtility;
import java.sql.SQLException;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;


public class MathUtilityTest {

    @Test //bien ham nay thanh main(), Shift-F6 de chay
    //goi ham getF() nhu thuong le, hay hon la tu dong ss gium
    //expected va actual coi co khop nhau hk?? co thay mau xanh
    //hk khop nhau thay mau do. Ta chi can nhin mau ma hk can mat cong
    //ss nua!!!!!!
    public void testFactorialRighArgumentRunsWell() {
        long expected = 120; //em muon biet 5! co dung la 120 hk?
        int n = 5;           //em dua 5 day a
        long actual = MathUtility.getFactorial(n); //tinh thiet coi
        //va so gium to luon
        assertEquals(expected, actual); //to chi thich den bao
        //giao thong hoy
        //tui sẽ test các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6)); //6! có phải 720?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        
        //0! là 1 tính huống cần test
        //1! là 1 tình huống khác cần test
        //6! là 1 tình huống khác cần test
        //TÌNH HUỐNG: TEST CASE. NGHỀ TESTER LÀ NGHỀ NGHĨ RA CÁC TEST
        //CASE, SAU ĐÓ THỬ NGHIỆM

        //assertEquals(0, MathUtility.getFactorial(1));
        //kì vọng sai, tính đúng -> 1 màu đỏ, ko khớp nhau
        //kì vọng đúng, tính sai -> 1 màu đỏ
        //tao hy vọng 5!=120, mày tính ra mấy, hàm m tính ra mấy?
    }

    //ta test xem phần ngoại lệ-exception
    //Exception là tình huống bất thường xảy ra trong app, trong code khi
    //app chạy. Nó ko phải là 1 value để có thể ss
    //Lỗi SQL trùng key, sai khóa ngoại, null trên cột yêu cầu khác null
    //đều là lỗi liên quan SQL nhưng ko thể nói thằng nào bằng thằng nào?
    //Đối với Exception, chỉ có thể đo nó = câu hỏi: MÀY CÓ XUẤT HIỆN KO?
    //ko dùng assertEquals() ss-coi-có-bằng-nhâu-hay-ko
    //trong thiết kế của hàm getFactorial() thì nếu đưa vào n<0 or n>2
    //thì hàm ném ra, sẽ new 1 ngoại lệ
    //cứ đưa n vi phạm, nhận về ngoại lệ
    //vậy nếu có ngoại lệ xảy ra khi n đưa vào cà chớn <0>21
    //CÓ NGHĨA RẰNG HÀM CHẠY ĐÚNG, THẤY NGOIAJ LỆ TA LẠI ĂN MỪNG, VÌ CHẠY
    //NHƯ THIẾT KẾ -> ĐÚNG CÓ NGOẠI LỆ TA CẦN NÓ XH -> MÀ XANH
    //SẼ CÓ TEST CASE, TÌNH HUỐNG TEST: XEM NGOẠI LỆ CÓ XH KO, CÓ -> XANH
    //                                               KO XH NHƯ DỰ KIẾN -> ĐỎ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});

        MathUtility.getFactorial(30);
        //nếu xh Exception như kì vọng, thì phải XANH
        //vì màu xanh here hàm ý rằng hàm chạy như thiết kế,
        //ném ngoại lệ khi đưa n cà chớn!!!!
        //TA CẦN KĨ THUẬT ĐỂ BẮT NGOẠI LỆ, ĐÚNG NGOẠI LỆ CẦN BẮT XH
        //TA CÓ XANH
    }

}
//QUY ƯỚC XANH: nếu all các lời gọi hàm getFactorial()
//đều trả ra giá trị đúng như kì vọng,  nói cách khác all các
//hàm assertEquals() đều ss khớp expected vs. actual
//thì có màu xanh
//XANH: KHI ALL CÁC TÌNH HUỐNG TEST HÀM ĐỀU, ĐỀU CHẠY ĐÚNG
//ĐỎ: chỉ cần 1 trong đám này sai, coi như ĐỎ CHO ALL
//Lí do phía sau: ĐÃ TEST HÀM THÌ HÀM PHẢI ĐÚNG CHO CÁC TÌNH
//HUỐNG TEST ĐC ĐƯA RA,
//ĐÃ TEST THÌ PHẢI ĐÚNG CHO CÁC TRƯỜNG HỢP ĐC ĐƯA RA
//KO chơi trò: hầu hết hàm đúng, lâu lâu mới sai...
