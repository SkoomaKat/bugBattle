package org.foxgames.storyBranch;

import org.foxgames.models.PlayerData;

public interface StoryBranch {

    /**
     * Method to be used by any class implementing StoryBranch. This will be run if the player chooses to play this branch
     * from the main game loop.
     * @param playerData existing player save data.
     * @return PlayerData Updated data to be saved upon return.
     */
    PlayerData play(PlayerData playerData);
}
