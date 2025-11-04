import java.util.*;

class ListSortable<E extends KLTN<?, ?>> {
    private List<E> list = new ArrayList<>();

    public void add(E item) {
        list.add(item);
    }

    public void sort() {
        list.sort(Comparator.comparing(k -> k.getThesisTitle().toLowerCase()));
    }

    public void print() {
        sort();
        for (E e : list) {
            System.out.println(e);
        }
    }
}