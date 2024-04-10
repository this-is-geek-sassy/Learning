package saswata.patterns.singletonAssignment;

public class Logger implements Cloneable {
	
	private static Logger instance;

	private Logger() {
		
	}
	
	public static Logger getInstance() {
		
		if (instance == null) {
			synchronized (Logger.class) {
				instance = new Logger();
			}
		}
		return instance;
	}
	
	public void Log(String message) {
		System.out.println(message);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clonning if this object is not supported");
	}

}
