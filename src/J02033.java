package src;
import java.util.*;

public class J02033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        // ảo

        for (int i = 0; i < n && k > 0 && array[i] < 0; i++) {
            array[i] = -array[i];
            k--;
        }

        Arrays.sort(array);

        // :)) khi k > 0, nếu k lẻ thì ta sẽ đổi dấu của phần tử nho nhất
        // :)) Nếu k chẵn, thì đổi đi đổi lại 1 phẩn tử => gia trị không thay đổi

        if (k % 2 != 0) {
            array[0] = -array[0];
        }

        long sum = 0;
        for (int num : array) {
            sum += num;
        }

        System.out.println(sum);
    }
}
