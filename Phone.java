
public class Phone {
	public String brand;
	public String model;
	public int batteryPercentage;
	
	public void charge() {
		if(batteryPercentage < 91) {
			batteryPercentage+=10;
			System.out.println("Da sac duoc");
		}else if(batteryPercentage >90 && batteryPercentage <100) {
			batteryPercentage = 100;
			System.out.println("Da sac day");
		}else {
			System.out.println("Pin da day!!");
		}
	}
	
	public void showStatus() {
		System.out.println(brand+" "+model+" - "+ "Pin: "+ batteryPercentage +"%");
	}
}
