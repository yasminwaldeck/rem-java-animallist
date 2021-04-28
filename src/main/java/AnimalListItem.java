import java.util.Objects;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value){
        this.value = value;
        this.next = null;
    }

    public Animal getValue() {
        return value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalListItem that = (AnimalListItem) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString(){
        return value.toString();
    }
}
