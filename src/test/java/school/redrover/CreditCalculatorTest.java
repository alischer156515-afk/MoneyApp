package school.redrover;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {

    @Test
    void shouldCalculateTotalForNastya() {
        List<Credit> credits = List.of(
                new Credit("VTB",  LocalDate.of(2026, 10, 15), 20324, "Nastya"),
                new Credit("VBRR", LocalDate.of(2026, 10, 15), 15120, "Nastya"),
                new Credit("SBER", LocalDate.of(2026, 10, 23), 18202, "Alischer")
        );

        double result = CreditCalculator.totalForOwner(credits, "Nastya");

        assertEquals(35444.0, result, 0.001);
    }
}