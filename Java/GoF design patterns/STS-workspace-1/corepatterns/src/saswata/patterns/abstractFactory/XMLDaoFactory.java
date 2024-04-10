package saswata.patterns.abstractFactory;

public class XMLDaoFactory extends DaoAbstactFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		if (type.equalsIgnoreCase("emp")) {
			dao = new XMLEmpDao();
		}
		else if (type.equalsIgnoreCase("dept")) {
			dao = new XMLDeptDao();
		}
		return dao;
	}

}
