package util;

import org.foxgames.IO.BugIO;
import org.foxgames.IO.TerminalInputHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void read_validInteger_returnsCorrectInteger() throws IOException {
        Integer expected = 3;
        String expectedString = "3";

        when(inputHandler.getInput()).thenReturn("3");

        Integer actual = bugIO.readInt();
        assertEquals(expected, actual);
    }
}
