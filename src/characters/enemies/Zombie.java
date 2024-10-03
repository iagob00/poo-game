package characters.enemies;

public class Zombie implements Enemy {
    public String attack() {
        return "Zumbi atacou!";
    }
    public String die() {
    	return "Zumbi morreu!";
    }
}