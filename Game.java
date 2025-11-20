package tristr;
import java.util.*;


public class Game {

	public static void main(String[] args) {

        Player p = new Player("Marko", 10, 10, new RectangleCollider(32, 32), 100);

        Enemy e1 = new MeleeEnemy("Goblin", 20, 10, new CircleCollider(8), 20, 60);
        Enemy e2 = new BossEnemy("Ork", 12, 10, new RectangleCollider(16, 16), 25, 120);

        List<Enemy> enemies = List.of(e1, e2);

        System.out.println("Player: " + p);
        System.out.println("Enemies:");
        enemies.forEach(System.out::println);

        System.out.println("\n--- ČEKAMO KOLIZIJE ---");

        for (Enemy e : enemies) {
            if (p.intersects(e)) {
                int old = p.getHealth();
                int dmg = e.getEffectiveDamage();
                p.setHealth(Math.max(0, old - dmg));

                System.out.println("HIT: " + p.getDisplayName() +
                        " by " + e.getDisplayName() +
                        " for " + dmg + " -> HP " + old + " -> " + p.getHealth());
            }
        }

        System.out.println("\nKonačno stanje: " + p);
    }

	}


