package characters.player;

public class DeadState implements PlayerState {

	@Override
	public String attack(Player player) {
		// TODO Auto-generated method stub
        throw new IllegalStateException("Player está morto!");
	}

	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
        return "Player morto";
	}

	@Override
	public void takeDamage(Player player) {
		// TODO Auto-generated method stub
        throw new IllegalStateException("Player está morto!");

	}

}
