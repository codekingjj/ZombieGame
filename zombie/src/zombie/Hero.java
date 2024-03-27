package zombie;

public class Hero extends Unit {
	private int power;

	public Hero(String name, int pos, int hp, int max) {
		super(name, pos, hp, max);
	}

	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int getPos() {
		return this.pos;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}
}
