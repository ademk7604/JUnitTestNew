package Day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class Day01Test05_TestExeptions {
    // test ettiğimiz metodun beklediğimiz exception fırlattı mı ?

    @Test
    public void testExeption(){  // gecmemesi gerekir bu test.
        String str = "Merhaba Dunya";
        assertThrows(NullPointerException.class, ()->{
            System.out.println("testExeptions is run");
            str.length();
        });
    }
    @Test
    void testExeption2(){  // benim istedigim exeptionu firlatiyorsa testim geciyor.
                          //bolme islemi icin exeption kontrolu
        int sayi1 = 1 ;
        int sayi2 = 0 ;
        //parent i da yazilabilir (RuntimeExeption)
        assertThrows(ArithmeticException.class, ()->{
            System.out.println(sayi1/sayi2);
        });
    }
    //yukaridaki soruyu method ekleyerek yapalim
    @Test
    void testExeption3(){
        int sayi1 = 1 ;
        int sayi2 = 0 ;
        assertThrows(ArithmeticException.class, () ->{
            divide(sayi1,sayi2); // olusturdugum method ile bakiyorum firklatiyormu firlatmiyormu. handel edilmis sekli oldu.
            // aritmeik ezeption firtatigini anladim
        });
    }

    private int divide(int a, int b){ // kendim yazdigim method
        return a/b;
    }
}
