import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OKJavaComingHome {
	public static void main(String[] args) { // args또한 parameter (Run configuration을 통해서 바꿀 수 있음)

		String home = args[0]; // parameter를 통해서 입력값 받기
		String bright = args[1];

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

		DimmingLights moodLamp = new DimmingLights(home + "mood Lamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();

	}
}
