import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class PayDayTest {

    @Test
    public void testPay()
    {
        PayDay payDayTesting = new PayDay();
        String test = payDayTesting.pay("Emory", 10.00, 10.00, 0.05);
        assertEquals("Emory 100 10 90", test);
    }
}