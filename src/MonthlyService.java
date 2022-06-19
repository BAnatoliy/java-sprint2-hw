import java.util.ArrayList;
import java.util.HashMap;

public class MonthlyService {
    String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                      "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    HashMap<Integer, MonthlyReport> monthReports;
    private int countOfMonth = 12;

    public MonthlyService() {
        monthReports = new HashMap<>();
    }

    private String getNameFile (int i) {
        String wayToFile = "resources/";
        String name;
        if (i <= 9) {
            name = wayToFile + "m.20210" + i + ".csv";
            return name;
        } else {
            name = wayToFile + "m.2021" + i + ".csv";
            return name;
        }
    }

    void getMonthlyReport() {
        String fileContents = null;
        for (int i = 1; i <= countOfMonth; i++) {
            fileContents = Read.readFileContentsOrNull(getNameFile(i));
            if (fileContents != null) {
                String[] lines = fileContents.split("\n");
                ArrayList<MonthlyRecords> monthRec = new ArrayList<>();
                for (int j = 1; j < lines.length; j++) {
                    String[] lineContents = lines[j].split(",");
                    String item_name = lineContents[0];
                    Boolean is_expense = Boolean.valueOf(lineContents[1]);
                    int quantity = Integer.valueOf(lineContents[2]);
                    double sum_of_one = Double.valueOf(lineContents[3]);
                    MonthlyRecords monthlyRecords = new MonthlyRecords(item_name, is_expense, quantity, sum_of_one);
                    monthRec.add(monthlyRecords);

                }
                MonthlyReport monthlyReport = new MonthlyReport(monthRec);
                monthReports.put(i, monthlyReport);
            } else {
                    monthReports.put(i, null);
            }
        }
    }

    void inputMonthlyReport() {
        for (int i = 0; i < countOfMonth; i++) {
            System.out.println("Отчет за " + month[i] + ":");
            CalculateMonthlyReport calcRep = new CalculateMonthlyReport(monthReports);
            calcRep.calculationMaxProfit(i+1);
        }
    }

    @Override
    public String toString() {
        return "MonthlyReport" + monthReports;
    }
}
