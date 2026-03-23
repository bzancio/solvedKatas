package OrderedPosition;

import java.util.PriorityQueue;

public class OrderedPosition {

    static void main() {
        System.out.println(OrderedPosition.orderedPositionOf(new String[] {"1", "2", "7", "4"}, 3));
    }

    public static <E extends Comparable<E>> int orderedPositionOf(E[] data, int order) {
        PriorityQueue<Comparable[]> queue = new PriorityQueue<>(data.length, (a, b) -> {
            return (a[0]).compareTo(b[0]);
        });
        for (int index = 0; index < data.length; index++) {
            queue.add(new Comparable[]{data[index], index});
        }
        for (int i = 0; i < order - 1; i++) {
            queue.poll();
        }
        return (int) queue.peek()[1];
    }
}
