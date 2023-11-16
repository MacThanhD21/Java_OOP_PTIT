package src.J07024;

import java.io.*;
import java.util.*;

public class WordSet {
    private TreeSet<String> data = new TreeSet<>();
    public WordSet(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            this.data.add(s);
        }
    }

    public WordSet(TreeSet<String> p) {
        this.data = p;
    }

    public WordSet difference(WordSet dif) {
        TreeSet<String> s = new TreeSet<>();
        for (String tmp : this.data) {
            if(!dif.data.contains(tmp)) {
                s.add(tmp);
            }
        }
        return new WordSet(s);
    }

    @Override
    public String toString() {
        String s = "";
        for (String res : this.data) {
            s += res + " ";
        }
        return s;
    }
}