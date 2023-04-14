package Day01.P01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day01Test_AssertionsP {

    @Test
    public void test(){

    }
    @Test
    public void testLength(){
        String cumleP = "Merhaba Dunya";
        int anlikDeger = cumleP.length();
        int beklenenDeger = 13;
        assertEquals(beklenenDeger,anlikDeger);
        //assertEquals metodu aracılığı ile belirtilen nesnelerin veya
        // primitive değerlerin kıyaslaması  yapılır.
    }
    @Test
    public void testUpperCase(){
        String anlikDeger = "Merhaba".toUpperCase();
        String beklenenDeger = "MERHABA";
        assertEquals(beklenenDeger,anlikDeger);
    }
    @Test
    public void testToplama(){
        int sayi1 = 12;
        int sayi2 = 6;
        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 18;
        assertEquals(anlikDeger,beklenenDeger);
    }
    @Test
    public void testContains(){
        assertEquals(false,"Mirac".contains("z"));

    }

}
