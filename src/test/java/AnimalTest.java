import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void testToString(){
        Animal test = new Animal("test");
        assertEquals("test", test.toString());
    }


    @Test
    public void equalsTest(){
        Animal test1 = new Animal("test");
        Animal test2 = new Animal("test");
        assertEquals(test1, test2);
    }

}
