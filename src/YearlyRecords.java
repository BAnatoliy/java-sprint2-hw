public class YearlyRecords {
    int month;
    double amount;
    boolean is_expense;

    public YearlyRecords(int month, double amount, boolean is_expense) {
        this.month = month;
        this.amount = amount;
        this.is_expense = is_expense;
    }

    @Override
    public String toString() {
        return "YearlyRecords{" +
                "month=" + month +
                ", amount=" + amount +
                ", is_expense=" + is_expense +
                '}';
    }
}
