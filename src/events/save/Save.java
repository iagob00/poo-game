package events.save;

import events.GameState;

public class Save {
    private GameState gameState;

    public Save(GameState gameState) {
        this.gameState = gameState;
    }

    public GameState getGameState() {
        return gameState;
    }
}

