package Day01;

import org.junit.jupiter.api.Test; // jupiter bagimliliklarini pomx indirdik

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day01Test01_Assertions { // burayi tiklayip sag run dersem butun clasi test etmis olurum


    @Test
    public void test(){
         //main metodu yokken nasil calisit?
         //Junit icinde gomulu gelen main metodu cagiriyor
        // class bosoldugu icin test gecti.

    }
    @Test
    public void testLength (){
        String cumle = "Merhaba Dunya"; // 13 karakter //14 yaptigimda org.opentest4j.AssertionFailedError: Expected :13 Actual   :14
        int anlikDeger = cumle.length();
        int beklenenDeger =13;
        //assertEquals(beklenenDeger,anlikDeger); // sonuc tutuyorsa test gecer.
        // testim hata verdiginde mesaj vermek istiyorsam
        assertEquals(beklenenDeger,anlikDeger, "Uzunluklar uyusmadi");
        // ilk parametre beklelennn deger 2 de anlik deger 3 te mesaj test ten gecerse cikacak mesaj

    }
    @Test
    public void testUpperCase(){
        String anlikDeger = "Merhaba".toUpperCase();
        String beklenenDeger = "MERHABA";
        assertEquals(beklenenDeger,anlikDeger); // mesaj almaz zorunda degil

    }
    // toplama islemini test edelim
    @Test
    public void testToplama(){
        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15 ;
        assertEquals(beklenenDeger,anlikDeger);

    }
    // contains() test edelim
    @Test
    public void testContains(){
        assertEquals(false,"Mirac".contains("z"));
    }
}
