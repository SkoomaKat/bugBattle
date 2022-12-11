package org.foxgames.storyBranch;

import org.foxgames.IO.IO;
import org.foxgames.enums.Choice;
import org.foxgames.models.PlayerData;
import org.foxgames.storyBranch.battle.BugBattle;

public class BranchHandler {
    PlayerData playerData;
    StoryBranch branch;
    Choice playerChoice;

    public BranchHandler(Choice playerChoice, PlayerData playerData) {
        switch (playerChoice) {
            case BATTLE:
                branch = new BugBattle(IO.getBugIO());
                break;
            default:
                branch = null;
                break;
        }

        this.playerChoice = playerChoice;
        this.playerData = playerData;
    }

    public void play() {
        if (playerChoice.equals(Choice.INVALID)) {
            IO.getBugIO().writeln("You you entered an invalid choice. Please try again.");
            return;
        }else if (playerChoice.equals(Choice.QUIT)) {
            quitGame();
        }

        saveGame(branch.play(playerData));
    }

    private void saveGame(PlayerData data) {

    }

    private void quitGame() {
        saveGame(playerData);
        IO.getBugIO().writeln("Quitting game. Press enter to exit.");
        IO.getBugIO().await();
        System.exit(0);
    }
}
