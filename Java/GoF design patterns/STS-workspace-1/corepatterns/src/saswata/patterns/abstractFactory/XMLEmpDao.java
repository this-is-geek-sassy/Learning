package saswata.patterns.abstractFactory;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving emp to xml");
	}

}
