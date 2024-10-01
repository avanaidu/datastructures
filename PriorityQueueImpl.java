package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class PriorityQueueImpl {

    public static void main(String[] args) {
        int[] arr = {8, 7, 4, 5, 6, 3, 1};
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));


        //System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.add(3));
        System.out.println(queue.poll());

    }
}
