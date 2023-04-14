package Day01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test03_BeForeEach_AfterEach {

    String str;
    @BeforeEach
    void beforeEach(){
        str= "JUnit5 is better than JUnit4";
        System.out.println("beforeEach() calisti");
    }
    // her testin basinda  beforeach e girip calisir sonra test  eder sonra AfterEach calisir.
    @AfterEach
    void afterEach(){
        str=null;
        System.out.println("afterEach() calisti");
    }

    @Test
    void testArrays( TestInfo info1){ // TestInfo interface ile bir info ismi verdik.
        //
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"JUnit5","is","better","than","JUnit4"};
        System.out.println(info1.getDisplayName()+ "calisti");
        System.out.println(info1.getTestClass());
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }


    // farkli bir ornek
    @Test
    void testStringLength(TestInfo info){
        int anlikDeger= str.length();
        int beklenenDeger =28;
        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName()+"calisti");

    }
}
