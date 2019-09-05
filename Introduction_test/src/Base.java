import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Appium code
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_25");
		//cap.setCapability(MobileCapabilityType.APP, value);
	}

}
