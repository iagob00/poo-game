package designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import characters.player.Player;

class TestPlayer {

    /*
     * Nome dos estados permitidos
     */
    private final String PLAYER_ALIVE = "Player vivo";
    private final String PLAYER_INJURED = "Player ferido";
    private final String PLAYER_DEAD = "Player morto";

    /*
     * Nomes dos ataques permitidos
     */
    private final String ATTACK_NORMAL = "Ataque normal";
    private final String ATTACK_WEAK = "Ataque fraco";

    @Test
    @DisplayName("Teste State do Jogador")
    void testPlayerState() {

        /*
         * Inicializa��o do jogador, que come�a no estado "vivo".
         */
        Player player = new Player();
        assertEquals(player.attack(), ATTACK_NORMAL);
        assertEquals(player.getState(), PLAYER_ALIVE);

        /*
         * Altera��o do estado do jogador para "ferido".
         */
        player.takeDamage();
        assertEquals(player.attack(), ATTACK_WEAK);
        assertEquals(player.getState(), PLAYER_INJURED);

        /*
         * Altera��o do estado do jogador para "morto".
         */
        player.takeDamage();
        Exception e = assertThrows(IllegalStateException.class, () -> player.attack());
        assertEquals(e.getMessage(), "Player est� morto!");
        assertEquals(player.getState(), PLAYER_DEAD);

        /*
         * Tentativa de ataque ou a��o com o jogador morto deve lan�ar exce��o.
         */
        Exception o = assertThrows(IllegalStateException.class, () -> player.attack());
        assertEquals(o.getMessage(), "Player est� morto!");

        o = assertThrows(IllegalStateException.class, () -> player.takeDamage());
        assertEquals(o.getMessage(), "Player est� morto!");
    }
}

