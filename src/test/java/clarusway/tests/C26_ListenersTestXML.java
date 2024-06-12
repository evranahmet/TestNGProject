package clarusway.tests;


import org.testng.SkipException;
import org.testng.annotations.Test;



public class C26_ListenersTestXML {
    //Listeners ve test classını bağlamanın ikinci yolu XML dosyasında çalıştırılacak testing öncesinde listeners classını belirtmektir.

    @Test
    public void test01() {
        System.out.println("test01");
    }

    @Test
    public void test02() throws Exception {
        System.out.println("test02");
        throw new Exception();
    }

    @Test
    public void test03() {
        System.out.println("test03");
        throw new SkipException("Skipped");
    }

    @Test
    public void test04() {
        System.out.println("test04");
        assert false;
    }

    @Test
    public void test05() {
        System.out.println("test05");
    }


}
