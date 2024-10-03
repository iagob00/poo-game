package events.observer;

public class GameHUD implements GameObserver {
    private int health = 100;

    @Override
    public void update(String event) {
        if (event.equals("Player took damage")) {
            health -= 20; // Atualizando o HUD com o dano
        } else if (event.equals("Player healed")) {
            health += 10; // Atualizando o HUD com a cura
        }
    }

    public int getHealth() {
        return health;
    }
}