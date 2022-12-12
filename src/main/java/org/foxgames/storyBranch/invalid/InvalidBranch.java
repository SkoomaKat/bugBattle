package org.foxgames.storyBranch.invalid;

import org.foxgames.IO.BugIO;
import org.foxgames.models.PlayerData;
import org.foxgames.storyBranch.StoryBranch;

public class InvalidBranch implements StoryBranch {
    private BugIO bugIO;

    public InvalidBranch(BugIO bugIO) {
        this.bugIO = bugIO;
    }

    @Override
    public PlayerData play(PlayerData playerData) {
        bugIO.writeln("\nYou you entered an invalid choice. Please try again.");
        return playerData;
    }
}
