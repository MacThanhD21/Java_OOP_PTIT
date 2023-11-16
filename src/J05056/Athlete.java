package src.J05056;

public class Athlete implements Comparable<Athlete> {
    private String id, name, DOB, st_time, en_time;

    public Athlete(int id, String name, String DOB, String st_time, String en_time) {
        this.id = "VDV" + String.format("%02d", id);
        this.name = name;
        this.DOB = DOB;
        this.st_time = st_time;
        this.en_time = en_time;
    }

    public String getId() {
        return this.id;
    }

    public long getRealTime() {
        String[] data1 = this.st_time.split(":");

        long start = Long.parseLong(data1[0]) * 3600
                + Long.parseLong(data1[1]) * 60
                + Long.parseLong(data1[2]);

        String[] data2 = this.en_time.split(":");

        long end = Long.parseLong(data2[0]) * 3600
                + Long.parseLong(data2[1]) * 60
                + Long.parseLong(data2[2]);

        return end - start;
    }

    public long getPrio() {
        int Age = 2021 - Integer.parseInt(this.DOB.substring(6));

        if (Age < 18) {
            return 0;
        } else if (Age < 25) {
            return 1;
        } else if (Age < 32) {
            return 2;
        } else {
            return 3;
        }
    }

    public long getResult() {
        return this.getRealTime() - this.getPrio();
    }

    @Override
    public String toString() {
        return this.id
                + " " + this.name
                + " "
                + String.format("%02d:%02d:%02d", this.getRealTime() / 3600, (this.getRealTime() % 3600) / 60,
                        this.getRealTime() % 60)
                + " "
                + String.format("%02d:%02d:%02d", this.getPrio() / 3600, (this.getPrio() % 3600) / 60,
                        this.getPrio() % 60)
                + " "
                + String.format("%02d:%02d:%02d", this.getResult() / 3600, (this.getResult() % 3600) / 60,
                        this.getResult() % 60);
    }

    @Override
    public int compareTo(Athlete o) {
        return (int) (this.getResult() - o.getResult());
    }
}