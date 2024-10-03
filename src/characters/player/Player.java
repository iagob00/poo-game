package characters.player;

import java.util.ArrayList;
import java.util.List;

import events.observer.GameObserver;

public class Player {
    private static Player playerInstance;

    private PlayerState state;

    private int health;
    private List<GameObserver> observers;
    
    public Player() {
        state = new AliveState(); 
        this.health = 100;
        this.observers = new ArrayList<>();
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public String attack() {
        return state.attack(this);
    }

    public String getState() {
        return state.getStateName();
    }

    public void takeDamage() {
        state.takeDamage(this);
    }
    
    public static Player getInstance() {
        if (playerInstance == null) {
        	playerInstance = new Player();
        }
        return playerInstance;
    }
    public void addObserver(GameObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(GameObserver observer) {
        observers.remove(observer);
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        notifyObservers("Player took damage");
    }

    public void heal(int amount) {
        this.health += amount;
        notifyObservers("Player healed");
    }

    private void notifyObservers(String event) {
        for (GameObserver observer : observers) {
            observer.update(event);
        }
    }

    public int getHealth() {
        return health;
    }
}
