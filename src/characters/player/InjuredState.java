package characters.player;

public class InjuredState implements PlayerState {

	@Override
	public String attack(Player player) {
		// TODO Auto-generated method stub
        return "Ataque fraco";
	}

	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
        return "Player ferido";
	}

	@Override
	public void takeDamage(Player player) {
		// TODO Auto-generated method stub
        player.setState(new DeadState()); // Muda o estado para morto

	}

}
