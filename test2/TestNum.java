import md3_Bai9_TH2_TimGiaTriTuyetDoi.AbsoluteNumberCal;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNum {
    @Test
    void findAbsolute() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCal.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCal.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    void testFindAbsoluteNegative1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCal.findAbsolute(number);
        assertEquals(expected, result);
    }


}
