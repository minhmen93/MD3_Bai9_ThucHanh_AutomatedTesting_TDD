package md3_Bai9_TH2_TimGiaTriTuyetDoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalTest {

    @Test
    void testFindAbsolute() {
    int number = 0;
    int expected = 0;
    int result = AbsoluteNumberCal.findAbsolute(number);
    assertEquals(expected,result);
    }
}