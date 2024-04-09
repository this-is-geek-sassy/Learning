package saswata.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	private Object readResolve() {
		return instance;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Not allowed to clone the object");
	}

}
