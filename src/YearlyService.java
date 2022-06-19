import java.util.ArrayList;

public class YearlyService {

    ArrayList<YearlyRecords> yearRec;
    int numOfYear = 2021;

    public YearlyService() {
        yearRec = new ArrayList<>();
    }

    void getYearlyReport() {
        String wayToFile = "resources/y." + numOfYear + ".csv";
        String fileContents = Read.readFileContentsOrNull(wayToFile);
            if (fileContents != null) {
                String[] lines = fileContents.split("\n");
                for (int j = 1; j < lines.length; j++) {
                    String[] lineContents = lines[j].split(",");

                    int month = Integer.valueOf(lineContents[0]);
                    double amount = Double.valueOf(lineContents[1]);
                    boolean is_expense = Boolean.valueOf(lineContents[2]);

                    YearlyRecords yearlyRecords = new YearlyRecords(month, amount, is_expense);
                    yearRec.add(yearlyRecords);
                }
            } else {
                yearRec.add(null);
            }
        }

        void yearReportInput() {
            System.out.println("Отчет за " + numOfYear + " год:");
            InputYearReport inputYearReport = new InputYearReport(yearRec);
            inputYearReport.inputYearlyReport();
            inputYearReport.averageExpenses();
            inputYearReport.averageGains();
        }



    @Override
    public String toString() {
        return "YearlyService{" +
                "yearRec=" + yearRec +
                '}';
    }
}



