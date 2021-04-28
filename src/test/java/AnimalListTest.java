import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalListTest {

    @Test
    public void addAndToStringTest(){

        //GIVEN

        Animal katze = new Animal("Katze");
        Animal hund = new Animal("Hund");
        Animal maus = new Animal("Maus");
        AnimalListItem firstItem = new AnimalListItem(hund);
        AnimalList testList = new AnimalList(firstItem);

        //WHEN

        testList.add(katze);
        testList.add(maus);

        assertEquals("Hund -> Katze -> Maus", testList.toString());

}


    @Test
    public void removeTest() {

        //GIVEN
        Animal katze = new Animal("Katze");
        Animal hund = new Animal("Hund");
        Animal maus = new Animal("Maus");
        Animal meerschweinchen = new Animal("Meerschweinchen");
        Animal hamster = new Animal("Hamster");
        AnimalListItem firstItem = new AnimalListItem(hund);
        AnimalList testList = new AnimalList(firstItem);

        testList.add(hund);
        testList.add(katze);
        testList.add(maus);
        testList.add(hund);
        testList.add(meerschweinchen);
        testList.add(hamster);
        testList.add(hund);
        testList.add(hund);


        //WHEN
        testList.remove(hund);

        //THEN
        assertEquals("Katze -> Maus -> Meerschweinchen -> Hamster", testList.toString());

}


    @Test
    public void addAfterRemoveTest() {

        //GIVEN
        Animal katze = new Animal("Katze");
        Animal hund = new Animal("Hund");
        Animal maus = new Animal("Maus");
        Animal meerschweinchen = new Animal("Meerschweinchen");
        Animal hamster = new Animal("Hamster");
        AnimalListItem firstItem = new AnimalListItem(hund);
        AnimalList testList = new AnimalList(firstItem);

        testList.add(hund);
        testList.add(katze);
        testList.add(maus);
        testList.add(hund);
        testList.add(meerschweinchen);
        testList.add(hamster);
        testList.add(hund);
        testList.add(hund);

        testList.remove(hund);

        //WHEN
        testList.add(hund);
        //THEN
        assertEquals("Katze -> Maus -> Meerschweinchen -> Hamster -> Hund", testList.toString());

    }

}
