package saswata.patterns.abstractFactory;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving department to XML");
	}

}
