import java.util.*;

public class J08026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int t = 0; t < testCases; t++) {
            int S = sc.nextInt();
            int T = sc.nextInt();

            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> visited = new HashSet<>();

            queue.add(S);
            visited.add(S);
            int steps = 0;
            boolean found = false;

            while (!queue.isEmpty() && !found) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    int current = queue.poll();

                    if (current == T) {
                        found = true;
                        break;
                    }

                    int nextA = current - 1;
                    int nextB = current * 2;

                    if (nextA > 0 && !visited.contains(nextA)) {
                        queue.add(nextA);
                        visited.add(nextA);
                    }

                    if (!visited.contains(nextB)) {
                        queue.add(nextB);
                        visited.add(nextB);
                    }
                }
                steps++;
            }

            System.out.println(steps - 1); // Subtract 1 for the initial step
        }
    }
}
