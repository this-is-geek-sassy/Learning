package saswata.patterns.abstractFactory;

public class DaoFactoryProducer {

	public static DaoAbstactFactory produce(String type) {

		DaoAbstactFactory abstactFactory = null;

		if (type.equalsIgnoreCase("xml")) {
			abstactFactory = new XMLDaoFactory();
		} else if (type.equalsIgnoreCase("db")) {
			abstactFactory = new DBDaoFactory();
		}

		return abstactFactory;
	}
}
