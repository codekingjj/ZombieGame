package zombie;

public class Boss extends Unit {
	private int shield, power;

	public Boss(String name, int pos, int hp, int max) {
		super(name, pos, hp, max);
		shield = 50;
	}

	public int getShield() {
		return this.shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}
}
