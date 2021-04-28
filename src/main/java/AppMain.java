public class AppMain {

    public static void main(String[] args) {
        Animal katze = new Animal("Katze");
        Animal hund = new Animal("Hund");
        Animal maus = new Animal("Maus");
        AnimalListItem help = new AnimalListItem(katze);

        AnimalList test = new AnimalList(help);
        test.add(hund);
        System.out.println(test.toString());
    }

}
