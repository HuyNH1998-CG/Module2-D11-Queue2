public class Client {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Solution.enQueue(queue, 5);
        Solution.enQueue(queue, 10);
        Solution.enQueue(queue, 15);
        Solution.displayQueue(queue);
        Solution.deQueue(queue);
        Solution.deQueue(queue);
        Solution.displayQueue(queue);
        Solution.enQueue(queue, 20);
        Solution.enQueue(queue, 25);
        Solution.displayQueue(queue);
    }
}
