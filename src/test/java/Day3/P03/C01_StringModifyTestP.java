package Day3.P03;

import Day3.C01_StringModify;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTestP {
    C01_StringModify stringModify;
    @BeforeEach
    void seUp (){
        stringModify = new C01_StringModify();
        System.out.println("@Beforeach calsiti");
    }
    @AfterEach
    void tearDown (){
        stringModify = null;
        System.out.println("@AfterEach calisti");
    }

    @ParameterizedTest
    @CsvSource(value ={"BC, AABC","BC, ABC","BC, BAC","DM,ADM","DNA,DANA"})
    void deleteAIfIsinFirstTwoPositionTest(String expected, String param){
        assertEquals(expected, stringModify.deleteAIfIsinFirstTwoPosition(param));

    }
}
