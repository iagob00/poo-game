package designpatterns;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import map.GameMap;

class TestGameMap {

    @Test
    @DisplayName("Teste Singleton para GameMap")
    void test() {

        /*
         * Instanciação de três mapas de jogo utilizando o padrão Singleton.
         */
        GameMap map1 = GameMap.getInstance();
        GameMap map2 = GameMap.getInstance();
        GameMap map3 = GameMap.getInstance();

        /*
         * Alteração de uma característica no primeiro mapa. Essa alteração deverá se
         * refletir nos outros mapas, pois é o mesmo objeto.
         */
        map1.setDifficultyLevel(5);
        assertEquals(map1.getDifficultyLevel(), map2.getDifficultyLevel());
        assertEquals(map1.getDifficultyLevel(), map3.getDifficultyLevel());

        /*
         * Verificação de que os três mapas são o mesmo objeto.
         */
        assertSame(map1, map2);
        assertSame(map1, map3);
    }
}
