package characters.player;

public class AliveState implements PlayerState {

	@Override
	public String attack(Player player) {
		// TODO Auto-generated method stub
        return "Ataque normal";
	}

	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
        return "Player vivo";
	}

	@Override
	public void takeDamage(Player player) {
		// TODO Auto-generated method stub
        player.setState(new InjuredState()); // Muda o estado para ferido

	}

}
