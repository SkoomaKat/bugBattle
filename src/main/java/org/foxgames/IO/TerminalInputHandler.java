package org.foxgames.IO;

import java.util.Scanner;

public class TerminalInputHandler {
    private final Scanner scanner;

    public TerminalInputHandler(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public String getKey() {
        return scanner.next();
    }
}
