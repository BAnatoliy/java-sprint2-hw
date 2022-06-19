import java.util.ArrayList;

public class InputYearReport {
    String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    double[] gain = new double[12];
    double[] expense = new double[12];
    ArrayList<YearlyRecords> yearRec;

    public InputYearReport(ArrayList<YearlyRecords> yearRec) {
        this.yearRec = yearRec;
    }

    void inputYearlyReport() {
        for (YearlyRecords yearRec : yearRec) {
            if (yearRec.is_expense) {
                expense[yearRec.month - 1] = yearRec.amount;
            } else {
                gain[yearRec.month - 1] = yearRec.amount;
            }
        }

        for (int i = 0; i < 12; i++) {
            double profit = gain[i] - expense[i];
            System.out.println("Прибыль за " + month[i] + " составила: " + String.format("%.2f",profit) + " руб.");
        }

    }

    void averageExpenses() {
        double sumExpense = 0;
        for (int i = 0; i < 12; i++) {
            sumExpense += expense[i];
        }
        System.out.println("\nСредний расход за все месяцы в году составил: " + String.format("%.2f", (sumExpense / 12)) + " руб.");
    }
    void averageGains() {
        double sumGain = 0;
        for (int i = 0; i < 12; i++) {
            sumGain += gain[i];
        }
        System.out.println("Средний доход за все месяцы в году составил: " + String.format("%.2f", (sumGain / 12)) + " руб.\n" );
    }
}
