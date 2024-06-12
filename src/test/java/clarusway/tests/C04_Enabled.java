package clarusway.tests;

import org.testng.annotations.Test;

public class C04_Enabled {
/*
    - Belirli test yöntemini mevcut suitte/class’ta çalıştırmak isteyip istemediğimizi belirlememize yardımcı olur. Gereksinimin/fonksiyonun sık sık değişmesi gibi bazı nedenlerden dolayı bazen birkaç test yapmak istemiyoruz ve o belirli fonksiyon için mevcut çalışmayı bozmak istemiyoruz.
    - Bu durumlarda, bu özelliği @Test(enabled = false) olarak ayarlayarak söz konusu testi görmezden gelebilir/devre dışı bırakabiliriz. 
    - Aynı @Ignore annotation gibidir, o test case skip edilir yani görmezden gelinir.
*/

    @Test
    public void test01() {
        System.out.println("Test 01");
    }

    @Test(enabled = false)
    public void test02() {
        System.out.println("Test 02");
    }

    @Test
    public void test03() {
        System.out.println("Test 03");
    }


}
