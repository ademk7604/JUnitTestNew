package Day02;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformansTest {
    @Test
    void testPerformans(){ // yazilan metodlarin uzerinde 1 saniye icinde cozume ulasan methodlar testden gececek.
        //test edilen methodun  performansini test ediyoruz
        assertTimeout(Duration.ofSeconds(3), //3 saniyede calissin. // bilgisayarin gucunu oraya dogru yonlendiriyoruz
                ()-> IntStream.rangeClosed(1,100000).forEach(System.out::println));   //1 den 100000 kadar olan sayilari ekrana basilmasini istiyorum
    }

    //2.ornek
    @Test
    void testPrintPerformans2(){
        assertTimeout(Duration.ofSeconds(1),
                ()->IntStream.rangeClosed(1,5000).reduce((x,y)->Math.addExact(x,y)));
        // bu kod 2 saniyede gecmiyorsa bu kodu iptal edebiliyorum
        // Bunu nerede kullanabilir? Mesela Task olarak verdiginiz sorunun cozumu icin
        // yazilan kodun maksimum 2 saniye icinde ekrana sonucu vermesini istiyorsam
        //performan testlerini uygularim
    }
    }

