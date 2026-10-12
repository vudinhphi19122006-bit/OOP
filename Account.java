
public class Account {
	public String accountNumber;
	public String ownerName;
	public double balance;
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println(ownerName + " Vua nap vao "+ amount +"VND");
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println(ownerName+ " Vua rut "+ amount+"VND");
		}else {
			System.out.println("Rut tien that bai!" + ownerName +" qua ngheo?");
		}
	}
	
	public void checkBalance() {
		System.out.println("Tai khoan "+accountNumber+" |chu the "+ownerName+" |so du "+ balance+ "VND");
	}
}
