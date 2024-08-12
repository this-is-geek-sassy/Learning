package package1;

import org.junit.jupiter.api.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodsOrderedByOrderIndexTest {

    public StringBuilder completed = new StringBuilder("");

    @AfterEach
    public void afterEach() {
        System.out.println("the state of instance object is " + completed);
    }

    @Test
    @Order(1)
    void testC() {
        System.out.println("running test C");
        completed.append(1);
    }
    @Test
    @Order(3)
    void testA() {
        System.out.println("running test A");
        completed.append(3);
    }

    @Test
    @Order(2)
    void testD() {
        System.out.println("running test D");
        completed.append(2);
    }

    @Test
    @Order(4)
    void testB() {
        System.out.println("running test B");
        completed.append(4);
    }
}
