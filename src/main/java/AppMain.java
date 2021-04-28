public class AppMain {

    public static void main(String[] args) {
        Animal katze = new Animal("Katze");
        Animal hund = new Animal("Hund");
        Animal maus = new Animal("Maus");
        Animal meerschweinchen = new Animal("Meerschweinchen");
        Animal hamster = new Animal("Hamster");

        AnimalList test = new AnimalList();
        test.add(hund);
        test.add(hund);
        test.add(katze);
        test.add(hund);
        test.add(hund);
        test.add(maus);
        test.add(meerschweinchen);
        test.add(hund);
        test.add(hamster);
        test.add(hund);
        test.add(hund);

        System.out.println(test.toString());
        test.remove(hund);
        System.out.println(test);
        test.add(hund);
        test.add(hund);
        System.out.println(test);
    }

}
