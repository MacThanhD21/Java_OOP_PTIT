package src.J07034;

public class Subject implements Comparable<Subject> {
    private String id, name, stc;


    public Subject(String id, String name, String stc) {
        this.id = id;
        this.name = name;
        this.stc = stc;
    }    


    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.stc;
    }


    @Override
    public int compareTo(Subject o) {
        return this.name.compareTo(o.name);
    }

}
