package Day01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day01Test04_BeforeAll_AfterAll {
    // testlerin hepsi bir kaynaktan faydalaniyorsa,
    @BeforeAll
    static void beforeAll(TestInfo info){ // illah static yazmamiza gerek yok
        System.out.println(info.getDisplayName()+ " open a file");
    }
    // 10 tane rask in varsa ilkinden once beforeAll calisir testler calisir sonra AfterAll ile biter
    //birden fazla test oldugunda sondan basa dogru yapiyor
    @AfterAll
    static void afterAll(TestInfo info){
        System.out.println(info.getDisplayName()+ " close a file");
    }
    @Test
    void testWithArrays(){
        String str = "Unit test with JUnit";
        String[] anlikDeger = str.split(" ");
        String[] beklenenDeger = {"Unit","test","with","JUnit"};
        assertArrayEquals(beklenenDeger,anlikDeger);
    }
}
