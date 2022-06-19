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
            switch (yearRec.month){
                case 1 : if (yearRec.is_expense) {
                    expense[0] = yearRec.amount;
                } else {
                    gain[0] =yearRec.amount;
                }
                    break;
                case 2 : if (yearRec.is_expense) {
                    expense[1] = yearRec.amount;
                } else {
                    gain[1] = yearRec.amount;
                }
                    break;
                case 3 : if (yearRec.is_expense) {
                    expense[2] = yearRec.amount;
                } else {
                    gain[2] = yearRec.amount;
                }
                    break;
                case 4 : if (yearRec.is_expense) {
                    expense[3] = yearRec.amount;
                } else {
                    gain[3] = yearRec.amount;
                }
                    break;
                case 5 : if (yearRec.is_expense) {
                    expense[4] = yearRec.amount;
                } else {
                    gain[4] = yearRec.amount;
                }
                    break;
                case 6 : if (yearRec.is_expense) {
                    expense[5] = yearRec.amount;
                } else {
                    gain[5] = yearRec.amount;
                }
                    break;
                case 7 : if (yearRec.is_expense) {
                    expense[6] = yearRec.amount;
                } else {
                    gain[6] = yearRec.amount;
                }
                    break;
                case 8 : if (yearRec.is_expense) {
                    expense[7] = yearRec.amount;
                } else {
                    gain[7] = yearRec.amount;
                }
                    break;
                case 9 : if (yearRec.is_expense) {
                    expense[8] = yearRec.amount;
                } else {
                    gain[8] = yearRec.amount;
                }
                    break;
                case 10 : if (yearRec.is_expense) {
                    expense[9] = yearRec.amount;
                } else {
                    gain[9] = yearRec.amount;
                }
                    break;
                case 11 : if (yearRec.is_expense) {
                    expense[10] = yearRec.amount;
                } else {
                    gain[10] = yearRec.amount;
                }
                    break;
                case 12 : if (yearRec.is_expense) {
                    expense[11] = yearRec.amount;
                } else {
                    gain[11] = yearRec.amount;
                }
                    break;
                default: break;
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
