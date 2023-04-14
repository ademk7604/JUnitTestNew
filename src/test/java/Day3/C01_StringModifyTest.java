package Day3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {
    C01_StringModify stringModify; // instance verilabil urettim

    @BeforeEach
    void setUp(){
        stringModify = new C01_StringModify(); // bur dada new ledim
        System.out.println("@BeforeEach calisti");

    }
    @AfterEach
    void tearDown(){
        stringModify = null;
        System.out.println("@AfterEach calisti");
    }

    @ParameterizedTest
    @CsvSource(value ={"BC, AABC","BC,ABC","BC,BAC","DM,ADM","DNA,DANA"})
    void deleteAIfIsinFirstTwoPositionTest(String expected, String param){
        assertEquals(expected,stringModify.deleteAIfIsinFirstTwoPosition(param));
        // deleteAIfIsinFirstTwoPosition(param), aabc yi kontrol eder a varsa siler aa yi sildi bc kaldi.
        // expected bc olmasi gerekiyordu oyle oldu gecer.
    }






}
