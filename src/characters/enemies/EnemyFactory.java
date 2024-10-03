package characters.enemies;

public class EnemyFactory {
    public static Enemy createEnemy(String tipo) {
    	 switch (tipo.toLowerCase()) {
 	    case "zumbi":
 	        return new Zombie();
 	    case "mutante": 
 	        return new Mutant();
 	    case "humanoide":
 	        return new Humanoid();
 	
 	    default:
 	        throw new IllegalStateException("Inimigo não encontrado!");}
    }
    
}