import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Insertion_Sort(a, n);
    }

    public static void Insertion_Sort(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {

            int k = i, res = i, tmp = arr[i];
            while (k > 0 && arr[k - 1] > tmp) {
                arr[k] = arr[k - 1];
                k--;
            }
            arr[k] = tmp;
            System.out.printf("Buoc %d: ", i);
            for(int x = 0; x < res + 1; x++) {
                System.out.print(arr[x] + " ");
            }
            System.out.println();
        }
    }
}
