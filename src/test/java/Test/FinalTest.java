package Test;

import java.io.IOException;
import org.testng.annotations.Test;
import Generics.Basetest;
import Naptol.Electronicacessories;
import Naptol.Homeentertainment;
import Naptol.Portableaudio1;
import Naptol.Portabledevice;
import Naptol.Securitygadgets;

public class FinalTest extends Basetest{
	
	@Test
	
	public void Runnertest() throws InterruptedException, IOException {
		
		Electronicacessories electronic = new Electronicacessories(driver);
		electronic.electronicacessories1();
			
		Portabledevice portdevice = new Portabledevice(driver);
		portdevice.port();
	
		Securitygadgets securityga = new Securitygadgets(driver);
		securityga.security();
		
		Homeentertainment homeenter = new Homeentertainment(driver);
		homeenter.entertainment();
		
		Portableaudio1 portaudio = new Portableaudio1(driver);
		portaudio.audio();
		
	}
		
}
