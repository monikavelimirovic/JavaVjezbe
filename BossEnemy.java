package tristr;

public class BossEnemy extends Enemy {
	 public BossEnemy(String type, int x, int y, Collidable c, int dmg, int hp) {
	        super(type, x, y, c, dmg, hp);
	    }
	 public int getEffectiveDamage() {
	        return damage * 2;
	    }

	    public String toString() {
	        return "BossEnemy[" + type + "] @ (" + x + "," + y + ") "
	                + collider.getDescription() + " DMG=" + damage + "x2 HP=" + health;
	    }
	}

