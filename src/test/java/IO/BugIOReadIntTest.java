package IO;

import org.foxgames.IO.BugIO;
import org.foxgames.IO.TerminalInputHandler;
import org.foxgames.exceptions.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class BugIOReadIntTest {
    @Mock
    TerminalInputHandler inputHandler;

    @InjectMocks
    BugIO bugIO;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void read_validInteger_returnsCorrectInteger() {
        Integer expected = 3;
        String userInput = "3";

        when(inputHandler.getInput()).thenReturn(userInput);

        Integer actual = bugIO.readInt("3");
        assertEquals(expected, actual);
    }

    @Test
    public void read_withNonIntegerString_throwsInvalidInputException(){
        String userInput = "not a number";

        when(inputHandler.getInput()).thenReturn(userInput);

        assertThrows( InvalidInputException.class,() -> bugIO.readInt("") );
    }

    @Test
    public void read_withLongString_throwsInvalidInputException(){
        String userInput = "999999999999999999999999999999999999999";

        when(inputHandler.getInput()).thenReturn(userInput);

        assertThrows( InvalidInputException.class,() -> bugIO.readInt("") );
    }
}
