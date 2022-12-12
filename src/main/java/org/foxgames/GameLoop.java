package org.foxgames;

import org.foxgames.IO.BugIO;
import org.foxgames.util.ChoiceConverter;
import org.foxgames.enums.Choice;
import org.foxgames.models.PlayerData;
import org.foxgames.persistence.DataHandler;
import org.foxgames.storyBranch.BranchHandler;

public class GameLoop {
    BugIO bugIO;
    DataHandler dataHandler;
    PlayerData playerData;
    String[] validOptions = new String[] {"battle", "quit"} ;
    boolean playing = true;

    public GameLoop(DataHandler dataHandler, BugIO bugIO) {
        this.dataHandler = dataHandler;
        this.bugIO = bugIO;

        this.playerData = dataHandler.loadGame("fake_save_file");
    }

    public void play() {
        bugIO.writeln("BugBattle, by jfox is beginning");

        while (playing) {
            Choice playerChoice = ChoiceConverter.getChoice(bugIO.readString(
                    String.format("Please enter a choice. \n" +
                            "Valid options are %s", String.join(", ", validOptions))));

            BranchHandler handler = new BranchHandler(playerChoice, dataHandler, bugIO);
            handler.play();
        }
    }
}
