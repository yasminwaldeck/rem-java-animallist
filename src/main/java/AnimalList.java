public class AnimalList {

    private AnimalListItem head;
    private AnimalListItem newest;
    private AnimalListItem latest;


    public AnimalList(AnimalListItem head){
        this.head = head;
        newest = head;
        latest = head;
    }

    public void add(Animal animal){
        newest.setValue(animal);
        latest.setNext(newest);
        latest = newest;
    }

    public void remove(Animal animal){
        //to be filled
    }

    @Override
    public String toString(){
        String listed = head.toString();
        AnimalListItem currentItem = head;
        while (currentItem.getNext() != null){
            listed += " -> " + currentItem.getNext();
            currentItem = currentItem.getNext();
        }
        return listed;
    }
}
