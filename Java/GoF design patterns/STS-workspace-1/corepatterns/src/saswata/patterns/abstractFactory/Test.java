package saswata.patterns.abstractFactory;

public class Test {

	public static void main(String[] args) {

		DaoAbstactFactory daoAbstactFactory = DaoFactoryProducer.produce("DB");
		Dao dao = daoAbstactFactory.createDao("emp");
		dao.save();
	}

}
