package school.redrover;

import java.util.List;
import java.util.Objects;

public class CreditPrinter {

    public static void print(Credit credit) {
        System.out.println("Банк: " + credit.getBankName());
        System.out.println("Дата платежа: " + credit.getPaymentDate());
        System.out.println("Сумма платежа: " + credit.getPaymentAmount());
        System.out.println("Оплачивает: " + credit.getName());
        System.out.println("-------------------------------------------------");
    }

    public static void printForOwner(List<Credit> credits, String owner) {
        for (Credit credit : credits) {
            if (Objects.equals(credit.getName(), owner)) {
                print(credit);
            }
        }
    }
}