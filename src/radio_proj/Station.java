package radio_proj;

public class Station {
	private String name;
	private double frequenz;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFrequenz() {
		return this.frequenz;
	}

	public void setFrequenz(double frequenz) {
		this.frequenz = frequenz;
	}

	public Station(String name, double frequenz) {
		this.name = name;
		this.frequenz = frequenz;
	}

	public Station(Station station) {
		this.name = station.getName();
		this.frequenz = station.getFrequenz();
	}
}
