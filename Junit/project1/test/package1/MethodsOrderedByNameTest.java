package package1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodsOrderedByNameTest {
    @Test
    void testC() {
        System.out.println("running test C");
    }
    @Test
    void testA() {
        System.out.println("running test A");
    }

    @Test
    void testD() {
        System.out.println("running test D");
    }

    @Test
    void testB() {
        System.out.println("running test B");
    }

}
