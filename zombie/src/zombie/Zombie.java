package zombie;

public class Zombie extends Unit {
	private int power;

	public Zombie(String name, int pos, int hp, int max) {
		super(name, pos, hp, max);
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

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setPower(int power) {
		this.power = power;
	}
}