public class Animal {
	String name;
	int numLegs;

	public Animal(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}

	public int getLegs() {
		return this.numLegs;
	}

	public String toString() {
		return name + ", " + numLegs;
	}
}
