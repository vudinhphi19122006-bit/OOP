
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon= Integer.parseInt(args[0]);
		do {
			System.out.println("He Thong BTH1");
			System.out.println("1. Book");
			System.out.println("2. Student");
			System.out.println("3. Account");
			System.out.println("4. Phone");
			System.out.println("Any Press. Exit");
			if(chon <0 || chon >= 5) {
				System.out.println("Chon lai");
			}
		}while(chon <0 || chon >= 5);
		switch (chon) {
		case 1: {
			Book b1 = new Book();
			b1.title = "Lap trinh java can ban";
			b1.author = "Duong Huu Thanh";
			b1.price = 105.999;
			
			Book b2 = new Book();
			b2.title = "Ky thuat lap trinh";
			b2.author = "Nguyen Van Bay";
			b2.price = 100.999;
			
			System.out.println("----THONG TIN SACH----");
			b1.displayInfo();
			b2.displayInfo();
			
			break;
		}
		
		case 2: {
			Student sv1 = new Student();
			sv1.id = "2451052188";
			sv1.name = "Vu Dinh Phi";
			sv1.major = "Cong Nghe Thong Tin";
			
			Student sv2 = new Student();
			sv2.id = "2451052009";
			sv2.name = "Duong Vu Phong";
			sv2.major = "Khoa Hoc May Tinh";;
			
			System.out.println("----THONG SINH VIEN----");
			sv1.displayInfo();
			sv2.displayInfo();
			break;
		}
		
		case 3: {
			Account a1 = new Account();
			a1.accountNumber = "12343456";
			a1.ownerName ="Vu Phi";
			a1.balance = -150000;
			
			a1.checkBalance();
			a1.deposit(200000);
			a1.checkBalance();
			a1.withdraw(50000);
			a1.checkBalance();
			a1.withdraw(200000);
			
			a1.checkBalance();
			break;
		}
		
		case 4: {
			Phone p1 = new Phone();
			p1.brand="Iphone";
			p1.model="15";
			p1.batteryPercentage = 75;
			
			
			p1.showStatus();
			p1.charge();
			p1.showStatus();
			p1.charge();
			p1.charge();
			p1.showStatus();
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + chon);
		}
	}
	
}
