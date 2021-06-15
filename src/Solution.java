public class Solution {
    public static void enQueue(Queue queue, int key){
        Node temp = new Node();
        temp.data = key;
        if (queue.head == null){
            queue.head = queue.tail = temp;
            return;
        }
        queue.tail.link=temp;
        queue.tail = temp;
    }
    public static void deQueue(Queue queue){
        if (queue.head == null){
            System.out.println("Empty Queue");
        }
//        Node temp = queue.head;
        queue.head = queue.head.link;
        if (queue.head == null){
            queue.tail = null;
        }
    }
    public static void displayQueue(Queue queue){
        Node temp = queue.head;
        if (temp.link == null){
            System.out.println("Queue:");
            System.out.println(temp.data);
            return;
        }
        System.out.println("Queue:");
        while(temp.link != queue.head){
            System.out.println(temp.data);
            temp = temp.link;
            if (temp.link == null){
                return;
            }
        }
    }
}
