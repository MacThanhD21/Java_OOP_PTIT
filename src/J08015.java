import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); 
            long K = sc.nextLong(); 
            long[] A = new long[N]; 

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            Map<Long, Integer> frequencyMap = new HashMap<>();

            int count = 0;

            for (int i = 0; i < N; i++) {
                long complement = K - A[i];

                if (frequencyMap.containsKey(complement)) {
                    count += frequencyMap.get(complement);
                }

                frequencyMap.put(A[i], frequencyMap.getOrDefault(A[i], 0) + 1);
            }
            System.out.println(count);
        }
    }
}
