import java.util.ArrayList;
import java.util.HashMap;

public class CompareReports {
    HashMap<Integer, MonthlyReport> monthReports;
    ArrayList<YearlyRecords> yearRec;
    String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    public CompareReports(HashMap<Integer, MonthlyReport> monthReports, ArrayList<YearlyRecords> yearRec) {
        this.monthReports = monthReports;
        this.yearRec = yearRec;
    }

    void compareReports() {
        double sumExpensesMon;
        double sumGainsMon;
        double sumExpensesYear;
        double sumGainsYear;

        if (!(monthReports == null) && yearRec.isEmpty()) {
            System.out.println("Отчеты не считаны");
        } else {
            for (int i = 1; i <= 12; i++) {
                sumExpensesMon = 0;
                sumGainsMon = 0;
                sumExpensesYear = 1;
                sumGainsYear = 1;

                if (!(monthReports.get(i) == null)) {
                    for (MonthlyRecords monRec : monthReports.get(i).monthRecords) {
                        if (!monRec.is_expense) {
                            sumGainsMon += monRec.sum_of_one * monRec.quantity;
                        } else {
                            sumExpensesMon += monRec.sum_of_one * monRec.quantity;
                        }
                    }
                } else {
                    System.out.println("Месячный отчет за " + month[i - 1] + " отсутствует!");
                }


                    for (YearlyRecords yearRec : yearRec) {
                        if (yearRec.month == i) {
                            if (yearRec.is_expense) {
                                sumExpensesYear += yearRec.amount - 1;
                            } else {
                                sumGainsYear += yearRec.amount - 1;
                            }
                        }
                    }


                if (sumExpensesMon == sumExpensesYear && sumGainsMon == sumGainsYear) {
                    System.out.println("Отчеты за " + month[i - 1] + " совпадают;\n");
                } else {
                    System.out.println("В отчете за " + month[i - 1] + " обнаружено несоответствие;\n");
                }

            }
        }
    }
}


