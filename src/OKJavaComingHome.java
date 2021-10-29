import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class OKJavaComingHome {
	public static void main(String[] args) {

		String home = JOptionPane.showInputDialog("Enter a home"); // 팝업 창으로 입력 받기
		String bright = JOptionPane.showInputDialog("Enter a bright level"); // 팝업 창으로 입력 받기

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
