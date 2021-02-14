package Lab30;

public class Node {
    Object value;
    Node next;
    public Node(Object value, Node next) {
        assert value != null;
        this.value = value;
        this.next = next;
    }



    public static void main(String[] args) {
        LinkedQueue linkedQueue = new LinkedQueue();
        ArrayQueue queue = new ArrayQueue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toStr());

        for (int i = 0; i < 5; i++) {
            linkedQueue.dequeue();
        }
        System.out.println(queue.toStr());

        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toStr());

        for (int i = 100; i < 108; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toStr());


        for (int i = 0; i < 10; i++) {
            linkedQueue.enqueue(i);
        }


    }




}
