package Lab29;

public class ArrayQueueModule {

    private static int size = 0;
    private static int head = 0;
    private static Object[] elements = new Object[5];


    public static void enqueue(Object element) {
        assert element != null;
        ensureCapacity(size + 1);
        elements[(head + size) % elements.length] = element;
        size++;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        if (head == 0) {
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        } else {
            for (int i = head; i < elements.length; i++) {
                newElements[i - head] = elements[i];
            }
            for (int i = 0; i <= (head + size) % elements.length; i++) {
                newElements[i + elements.length - head] = elements[i];
            }
            head = 0;
            elements = newElements;
        }
    }


    public static Object dequeue() {
        assert size > 0;
        Object x = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return x;
    }


    public static Object element() {
        assert size > 0;
        return elements[head];
    }


    public static int size() {
        return size;
    }


    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        Object[] newElements = new Object[5];
        elements = newElements;
        size = 0;
        head = 0;
    }


    public static String toStr() {
        StringBuilder str = new StringBuilder("[");
        if (size == 0) return "[]";
        if (head < (head + size) % elements.length) {
            for (int i = head; i < (head + size) % elements.length; i++) {
                str.append(elements[i].toString());
                str.append(", ");
            }
        } else {
            for (int i = head; i < elements.length; i++) {
                str.append(elements[i].toString());
                str.append(", ");
            }
            for (int i = 0; i < (head + size) % elements.length; i++) {
                str.append(elements[i].toString());
                str.append(", ");
            }
        }
        str.delete(str.length() - 2, str.length());
        str.insert(str.length(), ']');
        return str.toString();
    }
}