package org.foxgames.persistence;

import org.foxgames.models.PlayerData;

public class DataHandler {
    private PlayerData playerData = null;

    public void saveGame(PlayerData playerData) {
        this.playerData = playerData;
    }

    public PlayerData loadGame(String fileName) {
        return new PlayerData();
    }

    public PlayerData getCurrentData() {
        return this.playerData == null ? new PlayerData() : this.playerData;
    }
}
