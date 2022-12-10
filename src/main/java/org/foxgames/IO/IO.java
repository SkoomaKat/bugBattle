package org.foxgames.IO;

import java.util.Scanner;

public class IO {
    private static final BugIO bugIO = new BugIO(new TerminalInputHandler(new Scanner(System.in)));

    public static BugIO getBugIO() {
        return bugIO;
    }
}
