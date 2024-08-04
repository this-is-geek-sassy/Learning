package package1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderedByOrderIndexTest {

    @Test
    @Order(1)
    void testC() {
        System.out.println("running test C");
    }
    @Test
    @Order(3)
    void testA() {
        System.out.println("running test A");
    }

    @Test
    @Order(2)
    void testD() {
        System.out.println("running test D");
    }

    @Test
    @Order(4)
    void testB() {
        System.out.println("running test B");
    }
}
