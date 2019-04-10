package Domain;
//shows the maximum duration
public class EventMaxReport {
    private String date;
    private int max;


    public EventMaxReport(String date, int max) {
        this.date = date;
        this.max = max;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

