package org.foxgames.storyBranch.battle;

import org.foxgames.IO.BugIO;
import org.foxgames.models.PlayerData;
import org.foxgames.storyBranch.StoryBranch;

public class BattleBranch implements StoryBranch {
    private BugIO bugIO;

    public BattleBranch(BugIO bugIO) {
        this.bugIO = bugIO;
    }

    @Override
    public PlayerData play(PlayerData playerData) {
        bugIO.writeln("Commencing battle!\n");
        return new PlayerData();
    }
}
