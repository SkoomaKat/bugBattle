package org.foxgames.enums;

import org.foxgames.IO.IO;
import org.foxgames.storyBranch.StoryBranch;
import org.foxgames.storyBranch.battle.BattleBranch;
import org.foxgames.storyBranch.invalid.InvalidBranch;

public enum Choice {
    BATTLE(new BattleBranch(IO.getBugIO())),
    QUIT(new InvalidBranch(IO.getBugIO())),
    INVALID(new InvalidBranch(IO.getBugIO()));

    private final StoryBranch branch;

    Choice (final StoryBranch branch) {
        this.branch = branch;
    }
    public StoryBranch getBranch() {
        return branch;
    }
}
