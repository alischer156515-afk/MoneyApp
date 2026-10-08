package school.redrover;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Credit> credits = new ArrayList<>();

        credits.add(new Credit("VTB", LocalDate.of(2026, 10, 15), 20324, "Nastya"));
        credits.add(new Credit("Parking", LocalDate.of(2026, 10, 07), 4000, "Alischer"));
        credits.add(new Credit("Yandex", LocalDate.of(2026, 10, 07), 1522, "Alischer"));
        credits.add(new Credit("VBRR", LocalDate.of(2026, 10, 15), 15120, "Nastya"));
        credits.add(new Credit("SBER", LocalDate.of(2026, 10, 23), 18202, "Alischer"));
        credits.add(new Credit("TBANK", LocalDate.of(2026, 10, 25), 150000, "Alischer"));
        credits.add(new Credit("ALFA-BANK", LocalDate.of(2026, 10, 25), 100000, "Alischer"));

        CreditPrinter.printForOwner(credits, "Nastya");
        System.out.println("=== ... ===");
        CreditPrinter.printForOwner(credits, "Alischer");

        System.out.printf("Итого за месяц для Nastya: %.2f руб.%n",
                CreditCalculator.totalForOwner(credits, "Nastya"));
        System.out.printf("Итого за месяц для Alischer: %.2f руб.%n",
                CreditCalculator.totalForOwner(credits, "Alischer"));
    }
}