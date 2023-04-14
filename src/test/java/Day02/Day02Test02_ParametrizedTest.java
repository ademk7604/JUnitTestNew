package Day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParametrizedTest {

    @Test
    void testLength(){
        assertTrue("Mirac".length()>0);
        assertTrue("Tarik".length()>0);
        assertTrue("Ismail".length()>0);
        assertTrue("Taha".length()>0);
    }

    // yukaridaki methodu daha kolay yazmak icin parametreli testler kullaniriz
    @ParameterizedTest                                      // az sonra yapacagim test parametre alacak
    @ValueSource(strings={"Mirac","Tarik","Ismail","Taha"}) // bu annotation ile parametrelerimi giriyorum. arrys gibi dusunebiliriz
    void testLength2 (String str){                          // str ile her parametre icin calisip kontrol ediyor
        assertTrue(str.length()>0);
    }
    // valueSource de tek parametre girerken csvsource de ikili parametre olarak test ediyoruz
    // 2. ornek
    @Test
    void testUpperCase(){
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());
    }
    //Yukaridaki ornegi parametreli olarak test edelim

    @ParameterizedTest
    @CsvSource(value =
            {
                    "MERHABA, merhaba",
                    "JAVA,Java",
                    "TEST,Test"

    })
    void testUpperCase2(String str1, String str2){  //str1 buyuk olan str2 kucuk olan. hepsini methoddan geciriyor
        assertEquals(str1,str2.toUpperCase());     // bu biraz daha kolay yukardakine gore.
    }

    //3.ornek
    @ParameterizedTest
    @CsvSource(value ={"true,java,a","true,junit,u","false,hello,a"})
    void testContains(boolean b1,String str1,String str2){      // pararretmeler orantili olarak yazdik
        assertEquals(b1,str1.contains(str2));                    // assertEquals 2 parametre aliyordu birincisi boolen aldi ikincisi string bir karsilastirma
    }                                           //biz burda java yi test ediyoruz. iyi anlayalim diye yazilmis kodlari test ediyoruz. yarin kendi kodlarimzi test edecegiz



}
