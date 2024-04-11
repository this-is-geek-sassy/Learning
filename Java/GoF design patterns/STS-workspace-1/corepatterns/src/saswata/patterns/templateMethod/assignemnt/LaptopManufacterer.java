package saswata.patterns.templateMethod.assignemnt;

public class LaptopManufacterer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("adding harddisk for desktop");
	}

	@Override
	public void addRAM() {
		System.out.println("adding RAM for desktop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("adding keyboard for desktop");
	}

}
