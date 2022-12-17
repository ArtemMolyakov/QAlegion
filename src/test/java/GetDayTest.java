
import module7.GetDay;
import org.junit.jupiter.api.*;


import static module7.GetDay.getDay;
import static org.junit.jupiter.api.Assertions.*;

public class GetDayTest {
    @Test
    void oneShouldReturnMonday() {
        GetDay getDay = new GetDay();
        assertEquals("Sunday", getDay(1));
    }

    @Test
    void twoShouldReturnMonday() {
        GetDay getDay = new GetDay();
        assertEquals("Monday", getDay(2));
    }

    @Test
    void ThreeShouldReturnTuesday() {
        GetDay getDay = new GetDay();
        assertEquals("Tuesday", getDay(3));
    }

    @Test
    void fourShouldReturnWednesday() {
        GetDay getDay = new GetDay();
        assertEquals("Wednesday", getDay(4));
    }

    @Test
    void fiveShouldReturnThursday() {
        GetDay getDay = new GetDay();
        assertEquals("Thursday", getDay(5));
    }

    @Test
    void sixShouldReturnFriday() {
        GetDay getDay = new GetDay();
        assertEquals("Friday", getDay(6));
    }

    @Test
    void sevenShouldReturnSaturday() {
        GetDay getDay = new GetDay();
        assertEquals("Saturday", getDay(7));
    }

    @Test
    @DisplayName("Null pointer Exception test")
    void errorTestNull() {

        assertThrows(NullPointerException.class, () -> {
            GetDay.getDay(null);
        });
    }

    @Test
    void zeroShouldReturnErr() {
        GetDay getDay = new GetDay();

        assertEquals("The number should be equal or larger than 1", getDay(0));

    }

    @Test
    void eightShouldReturnErr() {
        GetDay getDay = new GetDay();

        assertEquals("The number should be equal or smaller than 7", getDay(8));
    }
}


