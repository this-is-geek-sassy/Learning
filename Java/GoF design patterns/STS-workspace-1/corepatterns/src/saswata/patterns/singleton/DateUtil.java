package saswata.patterns.singleton;

public class DateUtil {
	
	// Eager initialization
	// private static DateUtil instance = new DateUtil();
	private static DateUtil instance;
	
	static {
		instance = new DateUtil();
	}
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {
		
		// Lazy initialization
//		if (instance == null)
//			instance = new DateUtil();
		
		return instance;
	}

}
