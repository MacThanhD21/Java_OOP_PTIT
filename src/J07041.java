package test;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class J07041 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("DATA.in");
        ObjectInputStream is = new ObjectInputStream(file);
        ArrayList<Pair> a = (ArrayList<Pair>) is.readObject();
        Collections.sort(a);
        for (Pair i : a) {
            if (i.getFirst() < i.getSecond()) {
                System.out.println(i);
            }
        }
    }
}
