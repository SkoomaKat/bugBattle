package org.foxgames;

import org.foxgames.IO.IO;
import org.foxgames.persistence.DataHandler;

public class Main {
    public static void main(String[] args)
    {
        GameLoop game = new GameLoop(new DataHandler(), IO.getBugIO());
        game.play();
    }
}