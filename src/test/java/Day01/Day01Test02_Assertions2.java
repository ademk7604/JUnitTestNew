package Day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test02_Assertions2 {

    @Test
    public void testToFindMin(){
        assertTrue(Math.min(4,10)==4); // icerisndeki condition true olursa gecer
        assertFalse(Math.min(4,10)==10); // icerisndeki condition false olursa gecer
    }
    // baska bir ornek
    @Test
    public void testArrays(){
        String str= "Test islemi cok kolay";
        String [] anlikDizi = str.split(" ");
        String [] beklenenDizi = {"Test","islemi","cok","kolay"};
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi)); //assrtTrue boolen dondurdugu icin arrays,equals da boiolen sectik
    }             // Array oldugu icin Arrays.equals methodu icinde yazdik

}
