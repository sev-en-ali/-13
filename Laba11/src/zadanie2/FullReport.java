package zadanie2;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void report(Employee[] employees, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);

        String fullNameHeader = bundle.getString("fullname");
        String salaryHeader = bundle.getString("salary");
        System.out.printf("%-15s %-10s%n", fullNameHeader, salaryHeader);

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

        for (Employee employee : employees) {
            System.out.printf("%-15s %10s%n", employee.getFullname(), currencyFormatter.format(employee.getSalary()));
        }
    }
}
