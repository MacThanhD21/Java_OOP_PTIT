package src.J05056;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<Athlete> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new Athlete(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        // Tạo một danh sách mới và sao chép nội dung từ danh sách ban đầu
        ArrayList<Athlete> newArr = new ArrayList<>(arr);

        Collections.sort(newArr);

        HashMap<String, Integer> map = new HashMap<>();

        map.put(newArr.get(0).getId(), 1);

        for (int i = 1; i < newArr.size(); i++) {
            // Xử lý 1: Nếu Nó gặp thằng mà cùng hạng, thì lấy luôn giá trị value của key
            // trước đó vào key hiện tại
            if (newArr.get(i).getResult() == newArr.get(i - 1).getResult())
                map.put(newArr.get(i).getId(), map.get(newArr.get(i - 1).getId()));
            // Xử lý 2: Nếu như không cùng hạng với ai, thì có thể nhảy qua 1 hạng hiện tại
            // mà thằng vừa nãy đã bo qua, nhảy đến hạng tiếp theo, chính là i + 1.
            else {
                map.put(newArr.get(i).getId(), i + 1);
            }
        }

        Collections.sort(arr, new Comparator<Athlete>() {
            @Override
            public int compare(Athlete o1, Athlete o2) {
                return (int) (o1.getResult() - o2.getResult());
            }
        });

        for (Athlete X : arr) {
            System.out.print(X + " " + map.get(X.getId()));
            System.out.println();
        }
        sc.close();
    }
}