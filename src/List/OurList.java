package List;

import java.util.Iterator;

public interface OurList<Type> {
    void addLast(Type element);

    void add(Type element);

    Type get(int index);

    void set(int index, Type value);

    Type removeById(int index);

    int size();

    void clear();

    boolean remove(Type obj);

    // O(n) - to find the needle.
    boolean contains(Type obj);

    // O(n) is the complexity of using the iterator
    Iterator<Type> forwardIterator();

    Iterator<Type> backwardIterator();

    Iterator<Type> iterator();
}
