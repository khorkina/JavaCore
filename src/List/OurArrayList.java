package List;

import java.util.Iterator;

public class OurArrayList<Type> implements OurList<Type> {

    private static final int INITIAL_CAPACITY = 16;

    private int size;
    private Object[] source;

    public OurArrayList() {
        this.source = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }


    @Override
    public void addLast(Type element) {
        if (size == source.length)
            increaseCapacity();

        source[size++] = element;
    }

    @Override
    public void add(Type element) {
        if (size == source.length)
            increaseCapacity();

//        source[size++] = element;
        source[size] = element;
        size++;
    }

    void increaseCapacity() {
        int newCapacity = source.length * 2;
        Object[] newSource = new Object[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public Type get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return (Type) source[index];
    }

    @Override
    public void set(int index, Type value) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        source[index] = value;
    }

    @Override
    public Type removeById(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        Type res = (Type) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        source[size - 1] = null;
        size--;
        return res;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        source = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean remove(Type obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (source[i] == null) {
                    removeById(i);
                    return true;
                }
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (obj.equals(source[i])) {
                removeById(i);
                return true;
            }
        }
        return false;
    }

    @Override  // O(n) - to find the needle.
    public boolean contains(Type obj) {
        if (obj == null) {
            for (int i = 0; i < size; i++) {
                if (source[i] == null)
                    return true;
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (obj.equals(source[i]))
                return true;
        }
        return false;
    }

    @Override // O(n) is the complexity of using the iterator
    public Iterator<Type> forwardIterator() {
        Iterator<Type> iterator = new ForwardIterator();
        return iterator;
    }

    @Override
    public Iterator<Type> backwardIterator() {
        Iterator<Type> iterator = new BackwardIterator<>((Type[]) source, size);
        return iterator;
    }

    //    @Override
//    public void sort(Comparator<Type> comparator) {
//        Type[] copy = (Type[]) new Object[size];
//
//        int i = 0;
//        for (Type elt : this) {
//            copy[i++] = elt;
//        }//copy: {15, -8, 3}
//
//        Arrays.sort(copy, comparator);
//
//        // copy:{-8, 3, 15}
//        this.clear();
//        for (Type elt : copy) {
//            this.addLast(elt);
//        }
//    }
//
//    @Override
//    public Type max(Comparator<Type> comparator) {
//        if (size == 0)
//            throw new NoSuchElementException();
//
////        Iterator<Type> iterator = iterator();
////        Type max = iterator.next();
////
////        while (iterator.hasNext()) {
////            Type currentElt = iterator.next();
////            if (comparator.compare(currentElt, max) > 0)
////                max = currentElt;
////        }
//
//        Type max = this.get(0);
//
//        for (Type currentElt : this) {
//            if (comparator.compare(currentElt, max) > 0)
//                max = currentElt;
//        }
//
//        return max;
//    }
//
//    @Override
//    public Type min(Comparator<Type> comparator) {
//        return max(comparator.reversed());
//    }

    @Override
    public Iterator<Type> iterator() {
        return forwardIterator();
    }


    private class ForwardIterator implements Iterator<Type> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Type next() {
            if (currentIndex >= size)
                throw new IndexOutOfBoundsException();

            Type res = (Type) source[currentIndex];
            currentIndex++;
            return res;
        }
    }

    static class BackwardIterator<O> implements Iterator<O> {
        int currentIndex;
        O[] source;

        public BackwardIterator(O[] source, int size) {
            this.source = source;
            currentIndex = size - 1;
        }

        @Override
        public boolean hasNext() {
            return currentIndex >= 0;
        }

        @Override
        public O next() {
            if (currentIndex < 0)
                throw new IndexOutOfBoundsException();

            O res = source[currentIndex];
            currentIndex--;
            return res;
        }
    }
}
