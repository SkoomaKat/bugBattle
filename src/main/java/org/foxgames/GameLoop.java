package org.foxgames;

import org.foxgames.IO.BugIO;
import org.foxgames.IO.IO;
import org.foxgames.enums.Choice;
import org.foxgames.models.PlayerData;
import org.foxgames.storyBranch.BranchHandler;

public class GameLoop {
    BugIO bugIO = IO.getBugIO();
    PlayerData playerData;
    String[] validOptions = new String[] {"battle", "quit"} ;
    boolean playing = true;

    public void play() {
        bugIO.writeln("BugBattle, by jfox is beginning");

        while (playing) {
            Choice playerChoice = getChoice(bugIO.readString(
                    String.format("Please enter a choice. \n" +
                            "Valid options are %s", String.join(", ", validOptions))));
            BranchHandler handler = new BranchHandler(playerChoice, playerData);
            handler.play();
        }
    }

    /**
     * Converts String input to Choice enum .
     * @return The choice equivalent of the given string (capitalized). If no choices align with the given string then returns Choice.UNDEFINED
     */
    private Choice getChoice(String choice) {
        try {
            return Choice.valueOf(choice.toUpperCase());
        } catch (IllegalArgumentException illegalArgumentException) {
            return Choice.INVALID;
        }
    }
}
