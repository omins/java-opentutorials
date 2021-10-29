import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OKJavaComingHome {
	public static void main(String[] args) {

		String home = "Bundang APT 301";

		// Elevator call
		Elevator myElevator = new Elevator(home);
		myElevator.callForUp(1);

		// Security off
		Security mySecurity = new Security(home);
		mySecurity.off();

		// Light on
		Lighting hallLamp = new Lighting(home + " / Hall Lamp");
		hallLamp.on();

		Lighting floorLamp = new Lighting(home + " / Floor Lamp");
		floorLamp.on();

	}
}
