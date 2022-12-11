package org.foxgames.IO;

import java.io.IOException;
import java.util.Scanner;

public class TerminalInputHandler {
    private final Scanner scanner;

    public TerminalInputHandler(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public void await() throws IOException {
        System.in.read();
    }
}
