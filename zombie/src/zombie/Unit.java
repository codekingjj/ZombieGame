package zombie;

import java.util.Random;

abstract public class Unit {

	String name;
	int pos, hp, max, power;
	Random r;

	public Unit() {
	}

	public Unit(String name, int pos, int hp, int max) {
		this.name = name;
		this.pos = pos;
		this.max = max;
		this.hp = hp;
		r = new Random();
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
	
	public void setPos(int pos) {
		this.pos = pos;
	}
}
