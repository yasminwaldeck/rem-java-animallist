public class AnimalList {

    private AnimalListItem head;
    private AnimalListItem latest;

    public void add(Animal animal){
        if (head == null){
            AnimalListItem first = new AnimalListItem(animal);
            head = first;
            latest = first;
        } else {
            AnimalListItem nextItem = new AnimalListItem(animal);
            latest.setNext(nextItem);
            latest = nextItem;
        }
    }

    public void remove(Animal animal){

        while(animal.equals(head.getValue())) {
            this.head = head.getNext();
        }

        AnimalListItem currentItem = head;
        AnimalListItem nextItem = currentItem.getNext();

        while (nextItem != null){

            if(!animal.equals(nextItem.getValue())) {
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
        StringBuilder listed = new StringBuilder(head.toString());
        AnimalListItem currentItem = head;
        while (currentItem.getNext() != null){
            listed.append(" -> ").append(currentItem.getNext());
            currentItem = currentItem.getNext();
        }
        return listed.toString();
    }
}
