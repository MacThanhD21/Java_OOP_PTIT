
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07005 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("DATA.in")));
        
        ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();

        int[] fre = new int[1000001];
        for(int x : arr) {
            fre[x]++;
        }
        for(int i = 0; i < 1000001; i++) {
            if(fre[i] > 0) {
                System.out.println(i + " " + fre[i]);
            }
        }
    }
}
