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
         * Construção de um inimigo que não existe
         */
        Exception e = assertThrows(IllegalStateException.class, () -> EnemyFactory.createEnemy("outro"));
        assertEquals(e.getMessage(), "Inimigo não encontrado!");

        /*
         * Construção dos inimigos
         */
        Enemy zombie = EnemyFactory.createEnemy("zumbi");
        Enemy mutant = EnemyFactory.createEnemy("mutante");
        Enemy humanoid = EnemyFactory.createEnemy("humanoide");

        /*
         * Verificação das características de cada inimigo
         */
        assertInstanceOf(Zombie.class, zombie);
        assertEquals(zombie.attack(), "Zumbi atacou!");

        assertInstanceOf(Mutant.class, mutant);
        assertEquals(mutant.attack(), "Mutante atacou!");

        assertInstanceOf(Humanoid.class, humanoid);
        assertEquals(humanoid.attack(), "Humanoide atacou!");
    }
}
