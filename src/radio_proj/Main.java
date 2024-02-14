package radio_proj;

import java.util.ArrayList;
/**
 * @author Halima Zolfaghari
 *
 */
public class Main {
	
	public static ArrayList<Station> getStationHardcoded() {
		ArrayList<Station> lsStations = new ArrayList<Station>();
		lsStations.add(new Station("NDR INFO", 92.3));
		lsStations.add(new Station("KLASSIK", 105.1));
		lsStations.add(new Station("HAMBURG", 103.6));
		lsStations.add(new Station("NDR 2", 98.1));
		lsStations.add(new Station("NJOY", 92.7));
		return lsStations;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Radio radio = new Radio();

		radio.turnOn();

		//radio.scanHardcoded(getStationHardcoded());

		//radio.setVolume(33);

		//radio.getCurrentVolume();

		//radio.seekByName("HAMBURG");

		//radio.seekByFrequenz(98.1);

		//radio.getCurrentVolume();
	}
}
