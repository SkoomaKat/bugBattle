import org.foxgames.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    Main main = new Main();

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void testMethod_run_returnsTrue() {
        boolean result = main.testMethod();
        assertEquals(true, result, "Expected testMethod to return true. Have you changed code?");
    }
}
