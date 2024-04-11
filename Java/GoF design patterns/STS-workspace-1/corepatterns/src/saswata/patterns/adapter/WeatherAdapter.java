package saswata.patterns.adapter;

public class WeatherAdapter {
	
	public int findTemperature (int zipcode) {
		
		String city = null;
		
		if (zipcode == 711205) {
			city = "Bally";
		}
		
		WeatherFinder finder = new WeatherFinderImpl();
		int temp = finder.find(city);
		return temp;
	}

}
