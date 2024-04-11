package saswata.patterns.templateMethod;

public class CSVDataRenderer extends DataRenderer {

	@Override
	public String readData() {
		return "CSV data";
	}

	@Override
	public String processData(String data) {
		return "processed " + data;
	}

}
