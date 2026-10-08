package school.redrover;

import java.time.LocalDate;

public class Credit {

    private String bankName;
    private String name;
    private LocalDate paymentDate;
    private double paymentAmount;

    public Credit(String bankName, LocalDate paymentDate, double paymentAmount, String name) {
        this.bankName = bankName;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.name = name;
    }

    public String getBankName() {
        return bankName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }
}