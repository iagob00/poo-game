package map;

public class GameMap {
    private static GameMap instance;
    private int difficultyLevel;

    private GameMap() {
        this.difficultyLevel = 1;
    }

    public static GameMap getInstance() {
        if (instance == null) {
            instance = new GameMap();
        }
        return instance;
    }

    public void setDifficultyLevel(int level) {
        this.difficultyLevel = level;
    }

    public int getDifficultyLevel() {
        return this.difficultyLevel;
    }
}
