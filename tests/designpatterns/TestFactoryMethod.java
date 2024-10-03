package designpatterns;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import characters.enemies.Enemy;
import characters.enemies.EnemyFactory;
import characters.enemies.Humanoid;
import characters.enemies.Mutant;
import characters.enemies.Zombie;

class TestFactoryMethod {

    @Test
    @DisplayName("Teste Factory Method para Inimigos")
    void test() {
        
        /*
         * Constru��o de um inimigo que n�o existe
         */
        Exception e = assertThrows(IllegalStateException.class, () -> EnemyFactory.createEnemy("outro"));
        assertEquals(e.getMessage(), "Inimigo n�o encontrado!");

        /*
         * Constru��o dos inimigos
         */
        Enemy zombie = EnemyFactory.createEnemy("zumbi");
        Enemy mutant = EnemyFactory.createEnemy("mutante");
        Enemy humanoid = EnemyFactory.createEnemy("humanoide");

        /*
         * Verifica��o das caracter�sticas de cada inimigo
         */
        assertInstanceOf(Zombie.class, zombie);
        assertEquals(zombie.attack(), "Zumbi atacou!");

        assertInstanceOf(Mutant.class, mutant);
        assertEquals(mutant.attack(), "Mutante atacou!");

        assertInstanceOf(Humanoid.class, humanoid);
        assertEquals(humanoid.attack(), "Humanoide atacou!");
    }
}
