package saswata.patterns.templateMethod.assignemnt;

public abstract class ComputerManufacturer {

	public void buildComputer() {
		System.out.println("This is the computer builder method");
		this.addHardDisk();
		this.addKeyboard();
		this.addRAM();
		System.out.println("Your computer is now ready");
	}
	
	public abstract void addHardDisk();
	
	public abstract void addRAM();
	
	public abstract void addKeyboard();
}
