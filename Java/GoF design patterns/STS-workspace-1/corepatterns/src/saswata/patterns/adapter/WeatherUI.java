package saswata.patterns.adapter;

public class WeatherUI {

	public void showTemperature(int zipcode) {
		WeatherAdapter adapter = new WeatherAdapter();
		int temperature = adapter.findTemperature(711205);
		System.out.println(temperature);
	}
	public static void main(String[] args) {
		WeatherUI ui = new WeatherUI();
		ui.showTemperature(711205);
	}
}
