import java.util.Comparator;

public class DogCompare implements Comparator<Dog> {

	@Override
	public int compare(Dog d1, Dog d2) {
		if(d1.name.compareToIgnoreCase(d2.name)==0) {
			if(d1.numLegs>d2.numLegs) {
				return -1;
			}
			else if(d1.numLegs<d2.numLegs) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			return d1.name.compareTo(d2.name);
		}
	}
}


