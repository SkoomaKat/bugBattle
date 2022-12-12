package org.foxgames.storyBranch;

import org.foxgames.IO.BugIO;
import org.foxgames.IO.IO;
import org.foxgames.enums.Choice;
import org.foxgames.models.PlayerData;
import org.foxgames.persistence.DataHandler;

public class BranchHandler {
    BugIO bugIO;
    DataHandler dataHandler;
    PlayerData playerData;
    Choice playerChoice;

    public BranchHandler(Choice playerChoice, DataHandler dataHandler, BugIO bugIO) {
        this.playerChoice = playerChoice;
        this.dataHandler = dataHandler;
        this.bugIO = bugIO;

        this.playerData = dataHandler.getCurrentData();
    }

    public void play() {
        if (playerChoice.equals(Choice.QUIT)) {
            quitGame();
        }

        dataHandler.saveGame(playerChoice.getBranch().play(playerData));
    }
    private void quitGame() {
        bugIO.writeln("Quitting game. Press enter to exit.");
        bugIO.await();
        System.exit(0);
    }
}
