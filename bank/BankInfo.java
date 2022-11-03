package bank;

public class BankInfo {
	public void saving() {
		System.out.println("10000");
	}
	public void fixed() {
		System.out.println("2000");
	}
	public void deposit() {
		System.out.println("5000");
	}
	public static void main(String[] args) {
		BankInfo acc=new BankInfo();
		acc.saving();
		acc.fixed();
		acc.deposit();
		System.out.println(acc);
	}

}
