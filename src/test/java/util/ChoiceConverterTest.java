package util;

import org.foxgames.enums.Choice;
import org.foxgames.util.ChoiceConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChoiceConverterTest {

    @Test
    public void getChoice_withValidChoiceString_returnsCorrectChoice() {
        Choice actual = ChoiceConverter.getChoice("battle");
        assertEquals(Choice.BATTLE, actual);
    }

    @Test
    public void getChoice_withInvalidChoiceString_returnsInvalidChoice() {
        Choice actual = ChoiceConverter.getChoice("nonexistentChoice");
        assertEquals(Choice.INVALID, actual);
    }
}
