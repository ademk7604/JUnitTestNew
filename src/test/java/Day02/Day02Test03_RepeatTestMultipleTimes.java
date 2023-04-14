package Day02;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test03_RepeatTestMultipleTimes {

    //testi tekrarlatmak istersem ?
    @RepeatedTest(5)
    void testSubstring(){
        assertEquals("Java","Java is an OOP language".substring(0,4));//substring ilk parametre dahil son degil 4 dedik
        System.out.println("test calisti");
    }
    // 2.ornek
    //@Disabled // classi test etmek istedigimizde bir testin yapilmasini istemiyorsam @Disabled Annotationun uzerine koyuyoruz
    // herhangi bir testi disable etmek isteresek @Disabled Annotationun ilgili test methodun uzerine yazmamiz yeterli
    @RepeatedTest(3)
    void testRepeated(){
        assertEquals(2,Math.addExact(1,1)); // ayni testi neden 3 degfa yapiyoreum 3. orenk te anlayacahiz
        System.out.println("calisti");
    }
    //3.ornek
    Random rm = new Random();
    @RepeatedTest(5)
    void testMathExact(){
        int sayi1 = rm.nextInt(10); // 0 dan 10 kadar bir deger atanmasini istiyorum
        int sayi2 = rm.nextInt(10); //benim elimde her test calistiginda sayi1 ve 2 degerleri degismis sekilde calisacak
        assertEquals(sayi1+sayi2,Math.addExact(sayi1, sayi2));
        System.out.println("sayi1 = "+sayi1+" sayi2 = "+sayi2);
    }
}
