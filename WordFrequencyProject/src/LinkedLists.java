/**
 *
 * @author Frank van Heeswijk
 * @param <E>   Type of elements the list stores
 */
public class LinkedList<E> implements List<E> {
    /** Fake head node, meaning that it is not part of the List<E> it represents. **/
    private Node head;

    /** Fake tail node, meaning that it is not part of the List<E> it represents. **/
    private Node tail;

    /** If this list is a sublist of a LinkedList, then the parent will be in this variable. **/
    private LinkedList<E> parentList;

    /** The amount of modifications that occured to this LinkedList so far. **/
    private int modificationsCount;

    /** The size of this LinkedList. **/
    private int size;

    public LinkedList() { 
        this(Collections.emptyList());
    }

    public LinkedList(final Collection<? extends E> collection) {
        this.head = new Node(null);
        this.tail = new Node(null);
        connect(head, tail);
        addAll(collection);
    }

    private LinkedList(final Node head, final Node tail, final int size, final LinkedList<E> parentList) {
        this.head = head;
        this.tail = tail;
        this.size = size;
        this.parentList = parentList;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public boolean contains(final Object object) {
        return iteratorToStream().anyMatch(elem -> elem.equals(object));
    }

    @Override
    public Iterator<E> iterator() {
        return listIterator();
    }

    @Override
    public Object[] toArray() {
        return iteratorToStream().toArray();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(final T[] elemArray) {
        Objects.requireNonNull(elemArray);
        if (size() > elemArray.length) {
            return (T[])toArray();
        }
        Iterator<E> iterator = iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Object next = iterator.next();
            elemArray[index++] = (T)next;
        }
        for (int i = index; i < elemArray.length; i++) {
            elemArray[i] = null;
        }
        return elemArray;
    }

    @Override
    public boolean add(final E element) {
        add(size(), element);
        return true;
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
    public boolean containsAll(final Collection<?> collection) {
        Objects.requireNonNull(collection);
        return collection.stream().allMatch(this::contains);
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

    private void assertIndex(final int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void assertIndexExclusive(final int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void modifySize(final int deltaSize) {
        size += deltaSize;
        if (parentList != null) {
            parentList.modifySize(deltaSize);
        }
    }

    private void incrementModificationsCount() {
        modificationsCount++;
        if (parentList != null) {
            parentList.incrementModificationsCount();
        }
    }

    private Stream<E> iteratorToStream() {
        return StreamSupport.stream(spliterator(), false);
    }

    private LinkedListListIterator listNodeIteratorEmpty() {
        return new LinkedListListIterator(-1, head, 0, tail);
    }

    private LinkedListListIterator listNodeIteratorFromHead() {
        return new LinkedListListIterator(-1, head, 0, head.next);
    }

    private LinkedListListIterator listNodeIteratorFromTail() {
        return new LinkedListListIterator(size() - 1, tail.previous, size(), tail);
    }

    @SafeVarargs
    private final void connect(final Node... nodes) {
        if (nodes.length == 0 || nodes.length == 1) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < nodes.length - 1; i++) {
            Node node = nodes[i];
            node.next = nodes[i + 1];
            nodes[i + 1].previous = node;
        }
    }

    private class Node {
        public E value;
        public Node next;
        public Node previous;

        public Node(final E value) {
            this.value = value;
        }

        public boolean hasNext() {
            return (next != null);
        }

        public boolean hasPrevious() {
            return (previous != null);
        }

        @Override
        public String toString() {
            return "(" + value + ")";
        }
    }

    private class LinkedListListIterator implements ListIterator<E> {
        private Node next;
        private Node previous;
        private int nextIndex;
        private int previousIndex;

        private boolean removeAllowed;
        private boolean forward;
        private int expectedModificationsCount;

        public LinkedListListIterator(final int previousIndex, final Node previousNode, final int nextIndex, final Node nextNode) {
            this.next = nextNode;
            this.previous = previousNode;
            this.nextIndex = nextIndex;
            this.previousIndex = previousIndex;
            this.expectedModificationsCount = modificationsCount;
        }

        @Override
        public boolean hasNext() {
            return (next != tail);
        }

        @Override
        public E next() {
            checkConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            previous = next;
            next = next.next;
            nextIndex++;
            previousIndex++;
            forward = true;
            removeAllowed = true;
            return previous.value;
        }

        @Override
        public boolean hasPrevious() {
            return (previous != head);
        }

        @Override
        public E previous() {
            checkConcurrentModification();
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            next = previous;
            previous = previous.previous;
            previousIndex--;
            nextIndex--;
            forward = false;
            removeAllowed = true;
            return next.value;
        }

        @Override
        public int nextIndex() {
            if (next == null) {
                return size();
            }
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            if (previous == null) {
                return -1;
            }
            return previousIndex;
        }

        @Override
        public void remove() {
            checkConcurrentModification();
            if (!removeAllowed) {
                throw new IllegalStateException();
            }
            if (forward) {
                previous = previous.previous;
                previousIndex--;
                nextIndex--;
            }
            else {
                next = next.next;
            }
            connect(previous, next);
            decrementSize();
            incrementModificationsCount();
            removeAllowed = false;
        }

        @Override
        public void set(final E element) {
            checkConcurrentModification();
            if (!removeAllowed) {
                throw new IllegalStateException();
            }
            Node old = (forward) ? previous : next;
            old.value = element;
        }

        @Override
        public void add(final E element) {
            checkConcurrentModification();
            Node node = new Node(element);
            connect(previous, node, next);
            previous = node;
            previousIndex++;
            nextIndex++;
            incrementSize();
            incrementModificationsCount();
            removeAllowed = false;
        }

        private void incrementSize() {
            modifySize(1);
        }

        private void decrementSize() {
            modifySize(-1);
        }

        private void incrementModificationsCount() {
            expectedModificationsCount++;
            LinkedList.this.incrementModificationsCount();
        }

        private void checkConcurrentModification() {
            if (modificationsCount != expectedModificationsCount) {
                throw new ConcurrentModificationException();
            }
        }
    }

    private class LinkedListNodeListIterator implements ListIterator<Node> {
        private Node previous = head;
        private Node next = head.next;
        private int previousIndex = -1;
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return (next != tail);
        }

        @Override
        public Node next() {
            previous = next;
            next = next.next;
            previousIndex++;
            nextIndex++;
            return previous;
        }

        @Override
        public boolean hasPrevious() {
            return (previous != head);
        }

        @Override
        public Node previous() {
            next = previous;
            previous = previous.previous;
            previousIndex--;
            nextIndex--;
            return next;
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            return previousIndex;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(final Node node) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void add(final Node node) {
            throw new UnsupportedOperationException();
        }
    }
}