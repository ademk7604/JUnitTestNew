package Day01.P01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test01_BeForeEach_AfterEachP {

    String str;
    @BeforeEach
    void beforeEach (){
        str="JUnit5 is better than Junit4";
        System.out.println("beforeEach() calsiti");
    }
    @AfterEach
    void afterEach (){
        str=null;
        System.out.println("afterEach() calsiti");
    }
    @Test
    void testArrays(TestInfo info1){
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"JUnit5","is","better","than","Junit4"};
        System.out.println(info1.getDisplayName()+ "calisti");
        System.out.println(info1.getTestClass());
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }
    @Test
    void testStringLength(TestInfo info){
        int anlikDeger = str.length();
        int beklenenDeger = 28;
        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName());
    }
}
