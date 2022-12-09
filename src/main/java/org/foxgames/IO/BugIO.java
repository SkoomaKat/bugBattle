package org.foxgames.IO;

import org.foxgames.exceptions.InvalidInputException;

import java.util.Scanner;

public class BugIO {
    private final TerminalInputHandler inputHandler;

    public BugIO(final TerminalInputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    public void write(String text) {
        System.out.print(text);
    }

    public void writeln(String text) {
        System.out.println(text);
    }

    public String readString(String text) {
        writeln(text);
        return inputHandler.getInput();
    }

    public Integer readInt() {
        return readInt("");
    }

    /**
     * Reads input from the terminal as a string, converts it to an Integer and returns it.
     * @param text Text to display as a prompt before user input. Ex "Please enter a number."
     * @return The number entered by the user
     * @throws InvalidInputException if the input string does not map to a valid Integer.
     */
    public Integer readInt(String text) {

        // TODO - Implement Exception logic
        writeln(text);
        return Integer.parseInt(inputHandler.getInput());
    }
}

