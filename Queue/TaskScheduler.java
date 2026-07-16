import java.util.*;

public class TaskScheduler {

    public static int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char task : tasks)
            freq[task - 'A']++;

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int f : freq)
            if (f > 0)
                maxHeap.offer(f);

        int time = 0;

        while (!maxHeap.isEmpty()) {

            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;

            while (cycle > 0 && !maxHeap.isEmpty()) {

                int current = maxHeap.poll();

                if (current > 1)
                    temp.add(current - 1);

                time++;
                cycle--;
            }

            for (int value : temp)
                maxHeap.offer(value);

            if (maxHeap.isEmpty())
                break;

            time += cycle;
        }

        return time;
    }

    public static void main(String[] args) {

        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;

        System.out.println(leastInterval(tasks, n));
    }
}
