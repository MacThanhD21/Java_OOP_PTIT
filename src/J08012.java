import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        
        // Initialize lists for each vertex
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj.get(x).add(y);
            adj.get(y).add(x);
        }
        
        boolean flag = false;
        // System.out.println(adj.get(1).size());
        int vertex = 0;
        for(int i = 1; i <= n; i++) {
            if(adj.get(i).size() == n - 1) {
                vertex = i;
                flag = true;
                break;
            }
        }
        for(int i = 1; i <= n; i++) {
            if(i != vertex && adj.get(i).size() != 1) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
