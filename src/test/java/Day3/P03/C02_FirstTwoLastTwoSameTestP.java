package Day3.P03;

import Day3.C02_FirstTwoLastTwoSame;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C02_FirstTwoLastTwoSameTestP {
    C02_FirstTwoLastTwoSame obj1 = new C02_FirstTwoLastTwoSame();

    @ParameterizedTest
    @CsvSource(value ={"true, ABAB","false,ABBA","true, AB"})
    void check_If_First_Two_Last_Same(boolean rs, String str){
        assertEquals(rs,obj1.check_If_First_Two_Last_Same(str));
    }
}
