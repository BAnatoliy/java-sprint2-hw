import java.util.HashMap;

public class CalculateMonthlyReport {
    HashMap<Integer, MonthlyReport> monthReports;
    public CalculateMonthlyReport(HashMap<Integer, MonthlyReport> monthReports) {
        this.monthReports = monthReports;
    }

     void calculationMaxProfit(int i) {
        double maxGain = 0;
        String maxGainItemName = null;
        double maxExp = 0;
        String maxExpItemName = null;

        if (!(monthReports.get(i) == null)) {
            for (MonthlyRecords monRec : monthReports.get(i).monthRecords) {
                if (!monRec.is_expense) {
                    if (maxGain < (monRec.quantity * monRec.sum_of_one)) {
                        maxGain = monRec.quantity * monRec.sum_of_one;
                        maxGainItemName = monRec.item_name;
                    }
                } else {
                    if (maxExp < (monRec.quantity * monRec.sum_of_one)) {
                        maxExp = monRec.quantity * monRec.sum_of_one;
                        maxExpItemName = monRec.item_name;
                    }
                }
            }
            System.out.println("Название самого прибыльного товара: " + maxGainItemName + ", его сумма: " + String.format("%.2f", maxGain) + " руб.");
            System.out.println("Самая большая трата: " + maxExpItemName + ", ее сумма: " + String.format("%.2f", maxExp) + " руб.\n");
        } else if (monthReports.get(i) == null) {
            System.out.println("Отчет отсутствует.\n");
        }
    }

}
