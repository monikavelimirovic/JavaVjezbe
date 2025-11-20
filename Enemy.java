package tristr;

public class Enemy extends GameObject implements Attacker{
	
	    protected String type;
	    protected int damage;
	    protected int health;

	    public Enemy(String type, int x, int y, Collidable collider, int damage, int health) {
	        super(x, y, collider);

	        if (type.trim().isEmpty())
	            throw new IllegalArgumentException("Tip prazan");

	        if (damage < 0 || damage > 100)
	            throw new IllegalArgumentException("DMG 0-100");

	        if (health < 0 || health > 100)
	            throw new IllegalArgumentException("HP 0-100");

	        this.type = type.trim();
	        this.damage = damage;
	        this.health = health;
	    }

	    public int getEffectiveDamage() { return damage; }

	   

	    public String toString() {
	        return "Enemy[" + type + "] @ (" + x + "," + y + ") "
	                + collider.getDescription() + " DMG=" + damage + " HP=" + health;
	    }
	

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return type;
	}

}
