package zadanie2;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Александра Дубаневич", 1000000000000.0),
                new Employee("Король Мария", 100000000000.0),
                new Employee("Ануфриев Пётр", 99999999999999.9)
        };

        Locale usLocale = new Locale("en", "US");
        Locale ruLocale = new Locale("ru", "RU");
        FullReport.report(employees, usLocale);
        FullReport.report(employees, ruLocale);
    }
}