import java.util.List;

/**
 * This code has errors right now.  We need to actually add in the methods that 
 * all lists have.  We need to do this because we implemented the List interface
 * and classes that implement an interface promise to add that functionality (at least)
 * 
	When you have the IDE implement the interface, LOTS of methods will be added to 
	the class.  You will have to appropriately implement most of them.
 *
 */



public class WordWithCountList implements List<WordWithCount> {

	private int size;
	/*
	- java.util.List.size()
	- java.util.List.iterator()
	- java.util.List.add()
	- java.util.List.containsAll()
	- java.util.List.addAll()
	- java.util.List.removeAll()
	- java.util.List.retainAll()
	- java.util.List.get()
	- java.util.List.set()
	- java.util.List.add()
	- java.util.List.remove()
	- java.util.List.listIterator()
	- java.util.List.listIterator()
	*/
	
    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return listIterator();
    }


    @Override
    public boolean add(final E element) {
        add(size(), element);
        return true;
    }
    @Override
    public boolean containsAll(final Collection<?> collection) {
        Objects.requireNonNull(collection);
        return collection.stream().allMatch(this::contains);
    }

    @Override
    public boolean remove(final Object object) {
        ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals(object)) {
                listIterator.remove();
                return true;
            }
        }
        return false;
    }

 
    @Override
    public boolean addAll(final Collection<? extends E> collection) {
        return addAll(size(), collection);
    }

    @Override
    public boolean addAll(final int index, final Collection<? extends E> collection) {
        Objects.requireNonNull(collection);
        assertIndexExclusive(index);
        if (collection.isEmpty()) {
            return false;
        }
        ListIterator<E> listIterator = listIterator(index);
        collection.forEach(listIterator::add);
        return true;
    }

    @Override
    public boolean removeAll(final Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            return false;
        }
        int deletions = 0;
        ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            E next = listIterator.next();
            if (collection.stream().anyMatch(elem -> elem.equals(next))) {
                listIterator.remove();
                deletions++;
            }
        }
        return (deletions > 0);
    }

    @Override
    public boolean retainAll(final Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            return false;
        }
        int deletions = 0;
        ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            E next = listIterator.next();
            if (collection.stream().noneMatch(elem -> elem.equals(next))) {
                listIterator.remove();
                deletions++;
            }
        }
        return (deletions > 0);
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            return;
        }
        connect(head, tail);
        modifySize(-size());
    }

    @Override
    public E get(final int index) {
        assertIndex(index);
        return listIterator(index).next();
    }

    @Override
    public E set(final int index, final E element) {
        if (this == element) {
            throw new IllegalArgumentException();
        }
        assertIndex(index);
        ListIterator<E> listIterator = listIterator(index);
        E old = listIterator.next();
        listIterator.set(element);
        return old;
    }

    @Override
    public void add(final int index, final E element) {
        if (this == element) {
            throw new IllegalArgumentException();
        }
        assertIndexExclusive(index);
        ListIterator<E> listIterator = listIterator(index);
        listIterator.add(element);
    }

    @Override
    public E remove(final int index) {
        assertIndex(index);
        ListIterator<E> listIterator = listIterator(index);
        E old = listIterator.next();
        listIterator.remove();
        return old;
    }

    @Override
    public int indexOf(final Object object) {
        ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals(object)) {
                return listIterator.nextIndex() - 1;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(final Object object) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().equals(object)) {
                return listIterator.previousIndex() + 1;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override
    public ListIterator<E> listIterator(final int index) {
        assertIndexExclusive(index);
        ListIterator<E> listIterator;
        if (isEmpty()) {
            listIterator = listNodeIteratorEmpty();
        }
        else if (index <= size() / 2) {
            listIterator = listNodeIteratorFromHead();
            while (listIterator.hasNext() && index != listIterator.nextIndex()) {
                listIterator.next();
            }
        }
        else {
            listIterator = listNodeIteratorFromTail();
            while (listIterator.hasPrevious() && index != listIterator.nextIndex()) {
                listIterator.previous();
            }
        }
        return listIterator;
    }

    @Override
    public List<E> subList(final int fromIndex, final int toIndex) {
        if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        if (toIndex - fromIndex == 0) {
            return new LinkedList<>(head, head.next, 0, this);
        }
        ListIterator<Node> listIterator = new LinkedListNodeListIterator();
        while (listIterator.hasNext() && fromIndex != listIterator.nextIndex()) {
            listIterator.next();
        }
        Node fromNode = listIterator.next();
        while (listIterator.hasNext() && toIndex != listIterator.nextIndex()) {
            listIterator.next();
        }
        Node toNode = listIterator.previous();
        return new LinkedList<>(fromNode.previous, toNode.next, toIndex - fromIndex, this);
    }

    @Override
    public boolean equals(final Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof List<?>)) {
            return false;
        }
        List<?> otherList = (List<?>)other;
        if (size() != otherList.size()) {
            return false;
        }
        Iterator<E> iterator = iterator();
        Iterator<?> otherIterator = otherList.iterator();
        while (iterator.hasNext() && otherIterator.hasNext()) {
            E next = iterator.next();
            Object otherNext = otherIterator.next();
            if (!Objects.equals(next, otherNext)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iteratorToStream().toArray());
    }

    @Override
    public String toString() {
        return "[" + iteratorToStream()
                .map(object -> (object == null ? "null" : object.toString()))
                .collect(Collectors.joining(", ")) + "]";
    }
	
	public static void main(String[] args) {
		
	}

}
