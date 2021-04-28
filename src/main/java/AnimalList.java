public class AnimalList {

    private AnimalListItem head;
    private AnimalListItem latest;


    public AnimalList(AnimalListItem head){
         this.head = head;
         this.latest = head;
    }

    public void add(Animal animal){
        AnimalListItem nextItem = new AnimalListItem(animal);
        latest.setNext(nextItem);
        latest = nextItem;
    }

    public void remove(Animal animal){

        while(head.getValue() == animal) {
            this.head = head.getNext();
        }

        AnimalListItem currentItem = head;
        AnimalListItem nextItem = currentItem.getNext();

        while (nextItem != null){

            if(nextItem.getValue() != animal) {
                currentItem = currentItem.getNext();
            } else {
                currentItem.setNext(nextItem.getNext());
            }
            nextItem = currentItem.getNext();
            latest = currentItem;
        }

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
