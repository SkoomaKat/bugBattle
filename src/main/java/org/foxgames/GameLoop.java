package org.foxgames;

import org.foxgames.IO.BugIO;
import org.foxgames.IO.IO;
import org.foxgames.enums.Choice;
import org.foxgames.models.PlayerData;

public class GameLoop {
    BugIO bugIO = IO.getBugIO();
    PlayerData data;

    public void play() {
        bugIO.writeln("BugBattle, by jfox is beginning");

        handleChoice(getChoice());

        bugIO.await();
    }

    private Choice getChoice() {
        return Choice.valueOf(bugIO.readString("Please enter a choice.").toUpperCase());
    }

    private void handleChoice(Choice choice) {
        if (choice.equals(Choice.BATTLE)) {
            bugIO.writeln("You have chosen to battle.");
        } else if (choice.equals(Choice.QUIT)) {
            bugIO.writeln("You should be ashamed, quitter.");
        } else {
            bugIO.writeln(String.format(
                    "The choice %s is not supported at this time.", choice.name()));
        }
    }
}
