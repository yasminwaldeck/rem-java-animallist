import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalListItemTest {

    @Test
    public void testToString(){
        Animal test = new Animal("test");
        AnimalListItem testItem = new AnimalListItem(test);
        assertEquals("test", testItem.toString());
    }

    @Test
    public void testNext(){

        Animal test = new Animal("test");
        Animal test2 = new Animal("test2");

        AnimalListItem testItem = new AnimalListItem(test);
        AnimalListItem testItem2 = new AnimalListItem(test2);
        testItem.setNext(testItem2);
        AnimalListItem next = testItem.getNext();
        assertEquals("test2", next.toString());

    }

}
