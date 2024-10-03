package designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import characters.player.Player;
import events.observer.*;

class TestObserver {

    @Test
    @DisplayName("Teste Observer para Eventos do Jogo")
    void testObserver() {

        /*
         * Instanciação dos elementos observadores e os sujeitos que serão monitorados.
         */
        GameObserver hud = new GameHUD(); 
        GameObserver scoreSystem = new ScoreSystem(); 
        Player player = new Player(); 

        /*
         * A interface de usuário e o sistema de pontuação devem implementar a interface Observer
         */
        assertInstanceOf(GameObserver.class, hud);
        assertInstanceOf(GameObserver.class, scoreSystem);

        /*
         * O jogador deve implementar a interface Subject
         */
        assertInstanceOf(Player.class, player);

        /*
         * Inscrevendo os observadores para serem notificados quando o jogador sofrer dano
         */
        player.addObserver(hud);
        player.addObserver(scoreSystem);

        /*
         * O jogador toma dano e os observadores devem ser notificados
         */
        player.takeDamage(20);

        /*
         * Verificando as atualizações nos observadores após o evento de dano
         */
        assertEquals(((GameHUD) hud).getHealth(), 80); 
        assertTrue(((ScoreSystem) scoreSystem).getEvents().contains("Player took damage"));

        /*
         * O jogador recupera a vida e os observadores são notificados
         */
        player.heal(10);
        assertEquals(((GameHUD) hud).getHealth(), 90);
        assertTrue(((ScoreSystem) scoreSystem).getEvents().contains("Player healed"));
    }
}

