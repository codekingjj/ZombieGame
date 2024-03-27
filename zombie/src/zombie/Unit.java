package zombie;

import java.util.Random;

abstract public class Unit {

	String name;
	int pos, hp, max;
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

}
