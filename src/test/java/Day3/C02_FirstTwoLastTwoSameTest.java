package Day3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C02_FirstTwoLastTwoSameTest {
    C02_FirstTwoLastTwoSame obj = new C02_FirstTwoLastTwoSame();

    @ParameterizedTest
    @CsvSource(value ={"true, ABAB","false, ABBA","true, AB"})
    void check_If_First_Two_Last_Same(boolean rs, String str){
        assertEquals(rs,obj.check_If_First_Two_Last_Same(str));
    }
}
