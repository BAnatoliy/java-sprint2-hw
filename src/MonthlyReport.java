import java.util.ArrayList;

public class MonthlyReport {

    ArrayList<MonthlyRecords> monthRecords;

    public MonthlyReport(ArrayList<MonthlyRecords> monthRecords) {
        this.monthRecords = monthRecords;
    }

    @Override
    public String toString() {
        return "{" + monthRecords +
                "}";
    }
}


