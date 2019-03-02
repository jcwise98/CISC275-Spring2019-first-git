public class Dog {
	String name;
	int numLegs;

	public Dog(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}

	public String toString() {
		return this.name + ", " + this.numLegs;
	}
}

