package zombie;

public class Boss extends Unit {
	private int shield, power;

	public Boss(String name, int pos, int hp, int max) {
		super(name, pos, hp, max);
		shield = 50;
	}

	public String getName() {
		return this.name;
	}

	public int getPos() {
		return this.pos;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPower() {
		return this.power;
	}

	public int getShield() {
		return this.shield;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}
}
