package Lab29;

public class ArrayQueueADT {

    private int size = 0;
    private int head = 0;
    private Object[] elements = new Object[5];


    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;
        ensureCapacity(queue, queue.size + 1);
        queue.elements[(queue.head + queue.size) % queue.elements.length] = element;
        queue.size++;
    }


    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity <= queue.elements.length) {
            return;
        }
        Object[] newElements = new Object[2 * capacity];
        if (queue.head == 0) {
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[i];
            }
            queue.elements = newElements;
        } else {
            for (int i = queue.head; i < queue.elements.length; i++) {
                newElements[i - queue.head] = queue.elements[i];
            }
            for (int i = 0; i <= (queue.head + queue.size) % queue.elements.length; i++) {
                newElements[i + queue.elements.length - queue.head] = queue.elements[i];
            }
            queue.head = 0;
            queue.elements = newElements;
        }
    }

    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;
        Object x = queue.elements[queue.head];
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return x;
    }


    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;
        return queue.elements[queue.head];
    }


    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }


    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }


    public static void clear(ArrayQueueADT queue) {
        Object[] newElements = new Object[5];
        queue.elements = newElements;
        queue.size = 0;
        queue.head = 0;
    }


    public static String toStr(ArrayQueueADT queue) {
        StringBuilder str = new StringBuilder("[");
        if (queue.size == 0) return "[]";
        if (queue.head < (queue.head + queue.size) % queue.elements.length) {
            for (int i = queue.head; i < (queue.head + queue.size) % queue.elements.length; i++) {
                str.append(queue.elements[i].toString());
                str.append(", ");
            }
        } else {
            for (int i = queue.head; i < queue.elements.length; i++) {
                str.append(queue.elements[i].toString());
                str.append(", ");
            }
            for (int i = 0; i < (queue.head + queue.size) % queue.elements.length; i++) {
                str.append(queue.elements[i].toString());
                str.append(", ");
            }
        }
        str.delete(str.length() - 2, str.length());
        str.insert(str.length(), ']');
        return str.toString();
    }
}
