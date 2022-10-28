import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayDayTest {

    @Test
    public void testPay()
    {
        PayDay payDayTesting = new PayDayTest();
        String test = payDayTesting.pay("Emory", 10.00, 10.00, 0.05);
        assertEquals("Emory 100 10 90", test);
    }
}