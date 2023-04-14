package Day3;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {
    @Test
    void operasyonlarTest(){ // mock okul  sinifindaki methodlar dogru duzgun cagrilip cagrilmadigini test ediyoruz.
        C05_Mock_Islemler dummyObject = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject.guncelleOgrenci("Ahmet");
        dummyObject.silOgrenci("Mehmet");
        dummyObject.ekleOgrenci("Kasım");
        // methodlar çağrılmış mı kontrol edelim
        verify(dummyObject).ekleOgrenci("Kasım");
        verify(dummyObject).silOgrenci("Mehmet");
        verify(dummyObject).guncelleOgrenci("Ahmet");
        //verify(dummyObject).ekleOgrenci("Leyla");// bu yukarda cagrilmadigi icin method da hata verdi
    }
    // method kaç kere çağrıldığını test edelim
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Mehmet");
        //dummyObject2.silOgrenci("Ahmet");
        // Acaba Ahmet parametresi ile ekleOgrenci() metodu 2 defa çağrıldı mı
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet"); // 2defa cagrildimi
        // ekleOgrenci() metodunu "Buse" parametresi ile çağırılığ çağrılmadığını test ediyorum
        verify(dummyObject2,times(0)).ekleOgrenci("Buse"); //hic cagrilmad mi?
        // herhangi bir parametre ile hic cagrilmayan methodu test etmek istersek
        verify(dummyObject2,never()).silOgrenci(anyString()); //anyString herhangi bir ogrenci ile sil methodu cagrilmadi degilmi
        // methodun en za 2 defa cagrildigini test etmek istersek :
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet"); // atLeast en az
    }

    // methodlarin cagrilma sirasinitest etmek istersem.
    @Test
    void testSiralama(){
        C05_Mock_Islemler dummyObject3 = Mockito.mock(C05_Mock_Islemler.class);// mockito moklicam.
        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Mehmet");
        dummyObject3.silOgrenci("Ahmet");

        //Inorder classi siralama icin kullaniliyor
        InOrder inOrder = inOrder(dummyObject3);
        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Mehmet");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");
        // ornegin veriabller veri tabanina
    }
}