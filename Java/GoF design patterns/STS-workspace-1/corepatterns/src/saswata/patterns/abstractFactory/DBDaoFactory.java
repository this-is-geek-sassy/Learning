package saswata.patterns.abstractFactory;

public class DBDaoFactory extends DaoAbstactFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		if (type.equalsIgnoreCase("emp")) {
			dao = new DBEmpDao();
		}
		else if (type.equalsIgnoreCase("dept")) {
			dao = new DBDeptDao();
		}
		return dao;
	}

}
