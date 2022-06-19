import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        MonthlyService monthlyService = new MonthlyService();
        YearlyService yearlyService = new YearlyService();

        Scanner scan = new Scanner(System.in);
        printMenu();
        int userInput = scan.nextInt();
        while(userInput != 0) {
            switch (userInput) {
                case 1:
                    monthlyService.getMonthlyReport();
                    System.out.println("Месячный ответ считан!");

                    break;
                case 2:
                    yearlyService.getYearlyReport();
                    System.out.println("Годовой ответ считан!");
                    break;
                case 3:
                    CompareReports compRep = new CompareReports(monthlyService.monthReports, yearlyService.yearRec);
                    compRep.compareReports();
                    break;
                case 4: monthlyService.inputMonthlyReport();
                    break;
                case 5: yearlyService.yearReportInput();
                    break;
                default:
                    System.out.println("Вы ввели неверное значение");
                    break;
            }
            printMenu();
            userInput = scan.nextInt();
        }
        System.out.println("Программа завершена");


    }


    static void printMenu() {
        System.out.printf(" 1. Считать все месячные отчёты;%n 2. Считать годовой отчёт;%n 3. Сверить отчёты;%n " +
        "4. Вывести информацию о всех месячных отчётах;%n 5. Вывести информацию о годовом отчёте;%n 0. Выход из программы.%n");
    }
}