package school.redrover;

import java.util.List;
import java.util.Objects;

public class CreditCalculator {

    public static double totalForOwner(List<Credit> credits, String owner) {
        double total = 0;
        for (Credit credit : credits) {
            if (Objects.equals(credit.getName(), owner)) {
                total = total + credit.getPaymentAmount();
            }
        }
        return total;
    }
}