package Day3;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class C06_ErrorTest {
    @Test
    void test (){
        //Error runner clasinda divide methodu 5 ve 0 parametrelereri ile hata firlatirken
        // ayni methodu moklanan obje uzerinden cagirdigimizda hata firlatmaz, obje sahte oldugu icin
        // method gercekten calismaz.
        C06_Error testObj = Mockito.mock(C06_Error.class);
        testObj.divide(5,0); //method geliyormu diye bakiyoruz.
        // o methodun orada calisip calismamasi bizim icin onemli degil zaten orda exeption firlatiyor:)
    }
}
