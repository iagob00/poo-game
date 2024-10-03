package characters.player;

interface PlayerState {
	String attack(Player player);
    String getStateName();
    void takeDamage(Player player);
}