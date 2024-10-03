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
         * Instancia��o de tr�s mapas de jogo utilizando o padr�o Singleton.
         */
        GameMap map1 = GameMap.getInstance();
        GameMap map2 = GameMap.getInstance();
        GameMap map3 = GameMap.getInstance();

        /*
         * Altera��o de uma caracter�stica no primeiro mapa. Essa altera��o dever� se
         * refletir nos outros mapas, pois � o mesmo objeto.
         */
        map1.setDifficultyLevel(5);
        assertEquals(map1.getDifficultyLevel(), map2.getDifficultyLevel());
        assertEquals(map1.getDifficultyLevel(), map3.getDifficultyLevel());

        /*
         * Verifica��o de que os tr�s mapas s�o o mesmo objeto.
         */
        assertSame(map1, map2);
        assertSame(map1, map3);
    }
}
