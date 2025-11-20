package tristr;

public class RectangleCollider implements Collidable {

    private int x;
    private int y;
    
    private final int width;
    private final int height;
    

    public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
     * Kreira pravougaoni collider.
     * Bacamo izuzetak ako su dimenzije nevalidne — bolje je grešku uočiti odmah
     * nego skrivati je automatski postavljenim vrijednostima.
     */
    public RectangleCollider(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "RectangleCollider dimensions must be positive: width=" + width + ", height=" + height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override public int getX() { return x; }
    @Override public int getY() { return y; }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public String getDescription() {
        return "Rectangle " + width + "x" + height;
    }

    @Override
    public boolean intersects(Collidable other) {
        if (other == null) return false;

        if (other instanceof RectangleCollider) {
            return intersectsRectangle((RectangleCollider) other);
        }

        if (other instanceof RectangleCollider) {
            
            return other.intersects(this);
        }

        // Ako tip nije podržan — bez greške, samo nema sudara
        return false;
    }

   
    private boolean intersectsRectangle(RectangleCollider r) {
        return this.x < r.x + r.width &&
               this.x + this.width > r.x &&
               this.y < r.y + r.height &&
               this.y + this.height > r.y;
    }

    @Override
    public String toString() {
        return "RectangleCollider[x=" + x + ", y=" + y + 
               ", width=" + width + ", height=" + height + "]";
    }
}
