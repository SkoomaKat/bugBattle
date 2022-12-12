package org.foxgames.IO;

import org.foxgames.exceptions.InvalidInputException;

import java.io.IOException;
import java.util.Scanner;

public class BugIO {
    private final TerminalInputHandler inputHandler;

    public BugIO(final TerminalInputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    /**
     * Prints the given text to the console.
     */
    public void write(String text) {
        System.out.print(text);
    }

    /**
     * Prints the given text to the console, followed by a new line.
     */
    public void writeln(String text) {
        System.out.println(text);
    }

    /**
     * Pauses execution of the program until the user presses the enter key.
     */
    public void await() {
        try {
            inputHandler.await();
        } catch (IOException e) {
            throw new RuntimeException("\n An unexpected IO error occurred while running BugIO.await(). -> \n", e);
        }
    }

    /**
     * Reads input from the terminal as a string.
     * @param text Text to display as a prompt before user input. Ex "Please enter a number."
     * @return The string entered by the user.
     */
    public String readString(String text) {
        writeln(text);
        return inputHandler.getInput();
    }

    /**
     * Reads input from the terminal as a string, converts it to an Integer and returns it.
     * @param text Text to display as a prompt before user input. Ex "Please enter a number."
     * @return The number entered by the user
     * @throws InvalidInputException if the input string does not map to a valid Integer.
     */
    public Integer readInt(String text) {

        try {
            // TODO - Implement Exception logic
            writeln(text);
            return Integer.parseInt(inputHandler.getInput());
        } catch (NumberFormatException e) {
            throw new InvalidInputException("BugIO readInt could not parse input," +
                    " could be too large or not a valid number.\n INUPUT: " + text);
        }
    }
}

