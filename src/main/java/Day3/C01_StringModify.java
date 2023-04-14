package Day3;

public class C01_StringModify {
    //Task : kelimenin ilk iki harfinde A varsa silinsin
    // kelime icindeki harflerin hepsi buyuk olacak
    // AABC -> BC, ABC -> BC cevirecegim

        public String deleteAIfIsinFirstTwoPosition(String str){
            if (str.length()<=2){
                return str.replace("A","");
            }
            String firstTwoChars = str.substring(0,2);
            String afterFirstTwoChars = str.substring(2); //2 parametreden itibaren sonuncuya kadar.

            return firstTwoChars.replaceAll("A","")+afterFirstTwoChars;
        }   // A varsa hepsini hiclik yap arti afterFirstTwoChars hemen yanina gomuyorum.


}
