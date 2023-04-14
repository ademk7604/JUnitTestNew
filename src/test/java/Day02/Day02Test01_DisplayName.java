package Day02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class Day02Test01_DisplayName {
    @Test
    @DisplayName("Test parseInt() to check if it is throwing for non digit value") // methdunun ismini uzunca buraya yazabiliriz. ciktida bu iosim cikiyor.
    void testExeption(){ // bu kodu gordugunde hemen okumak anlamak lazim. test_parseInt_if_it_isthrowing_for_non_digit_value.. sacma isim olmaz
        String  str = "Merhaba";// bunu int cevirebilirmiyim bu donmez ama "23" donerdi
        assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt(str); // 23 vermis olsaydik firlatmayacakti test calismazdi. stirngi ineteger a ceviremedigi icn firlatiyor
        });
    }

}
