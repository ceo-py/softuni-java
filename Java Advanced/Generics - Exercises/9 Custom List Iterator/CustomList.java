import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {

    private List<T> values;

    public CustomList() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }

    public T remove(int index) {
        validateIndexes(index);
        return this.values.remove(index);
    }

    public boolean contains(T element) {
        return this.values.contains(element);
    }

    public void swap(int indexOne, int indexTwo) {
        validateIndexes(indexOne);
        validateIndexes(indexTwo);

        T firstElement = this.values.get(indexOne);
        T secondElement = this.values.get(indexTwo);

        this.values.set(indexOne, secondElement);
        this.values.set(indexTwo, firstElement);
    }

    private void validateIndexes(int index) {
        if (index < 0 || index >= this.values.size()) {
            throw new IndexOutOfBoundsException("Invalid indexes!");
        }
    }

    public int countGreaterThan(T element) {
        int count = (int) this.values.stream().filter(e -> e.compareTo(element) > 0).count();
        return count;
    }

    public T getMax() {
        if (this.values.isEmpty()) {
            throw new IllegalStateException("Empty List!!!");
        }
        T maxElement = this.values.get(0);
        for (int i = 1; i < this.values.size(); i++) {
            T current = this.values.get(i);
            if (current.compareTo(maxElement) > 0) {
                maxElement = this.values.get(i);
            }
        }
        return maxElement;
    }

    public T getMin() {
        if (this.values.isEmpty()) {
            throw new IllegalStateException("Empty List!!!");
        }
        T minElement = this.values.get(0);
        for (int i = 1; i < this.values.size(); i++) {
            T current = this.values.get(i);
            if (current.compareTo(minElement) < 0) { // compareTo returns 1, 0, -1
                minElement = this.values.get(i);
            }
        }
        return minElement;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : this.values) {
            sb.append(element).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < values.size();
            }

            @Override
            public T next() {
                return values.get(index++);
            }
        };
    }
}