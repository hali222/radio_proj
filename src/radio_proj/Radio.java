package radio_proj;

import java.util.ArrayList;

public class Radio {
	private boolean isOn = false;
	private int currentVolume;
	private Station currentStation;
	private ArrayList<Station> listStation;

	public int getCurrentVolume() {
		System.out.println("Lautstärke : " + this.currentVolume);
		System.out.println("#############################################");
		return this.currentVolume;
	}

	public void setVolume(int volume) {
		if (volume >= 0 && volume < 100) {
			this.currentVolume = volume;
			getCurrentVolume();
		} else {
			System.out.println("Eingegebene Lautstärke ist nicht gültig!");
			System.out.println("#############################################");
		}
	}

	public ArrayList<Station> getListStation() {
		for (Station station : listStation) {
			System.out.println(station.getName() + "\t" + station.getFrequenz());
		}
		return this.listStation;
	}

	public void scanHardcoded(ArrayList<Station> listStation) {
		this.listStation = new ArrayList<Station>(listStation);
		System.out.println("List verfügbare Radiosender:");
		for (Station station : listStation) {
			System.out.println(station.getName() + "\t" + station.getFrequenz());
		}
		System.out.println("#############################################");
	}

	public void seekByName(String name) {
		boolean foundFlag = false;
		for (Station station : this.listStation) {
			if (station.getName().equals(name)) {
				this.currentStation = new Station(station);
				foundFlag = true;
				getCurrentStation();
				break;
			}
		}
		if (foundFlag == false) {
			System.out.println("Radiosender nicht gefunden!");
			System.out.println("#############################################");
		}
	}

	public void seekByFrequenz(double frequenz) {
		boolean foundFlag = false;
		for (Station station : this.listStation) {
			if (station.getFrequenz() == frequenz) {
				this.currentStation = new Station(station);
				foundFlag = true;
				getCurrentStation();
				break;
			}
		}
		if (foundFlag == false) {
			System.out.println("Radiosender nicht gefunden!");
		}
	}

	public void turnOn() {
		this.isOn = true;
		System.out.println("Radio ist eingeschaltet!");
		System.out.println("#############################################");
		scanHardcoded(Main.getStationHardcoded());
		this.currentStation = new Station(listStation.get(0));
		this.currentVolume = 20;
		getCurrentStation();
	}

	public void turnOff() {
		this.isOn = false;
		System.out.println("Radio ist ausgeschaltet!");
		System.out.println("#############################################");
	}

	public Station getCurrentStation() {
		System.out.println(
				"Aktueller Radiosender : " + this.currentStation.getName() + "\t" + this.currentStation.getFrequenz());
		System.out.println("#############################################");
		return currentStation;
	}

	public void setCurrentStation(Station currentStation) {
		this.currentStation = currentStation;
		getCurrentStation();
	}
}
