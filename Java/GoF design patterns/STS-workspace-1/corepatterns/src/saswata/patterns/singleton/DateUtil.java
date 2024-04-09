package saswata.patterns.singleton;

public class DateUtil {
	
	// Eager initialization
	// private static DateUtil instance = new DateUtil();
	private static volatile DateUtil instance;
	
//	static {
//		instance = new DateUtil();
//	}
	
	private DateUtil() {
		
	}
	
//	public static synchronized DateUtil getInstance() {
	public static DateUtil getInstance() {
		
		if (instance == null) {
			synchronized (DateUtil.class) {
				// Lazy initialization
				if (instance == null)
					instance = new DateUtil();
			}
		}
		
		return instance;
	}

}
