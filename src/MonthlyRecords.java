public class MonthlyRecords {
    String item_name;
    Boolean is_expense;
    int quantity;
    double sum_of_one;

    public MonthlyRecords(String item_name, Boolean is_expense, int quantity, double sum_of_one) {
        this.item_name = item_name;
        this.is_expense = is_expense;
        this.quantity = quantity;
        this.sum_of_one = sum_of_one;
    }

    @Override
    public String toString() {
        return  "item_name='" + item_name + '\'' +
                ", is_expense=" + is_expense +
                ", quantity=" + quantity +
                ", sum_of_one=" + sum_of_one;
    }
}
