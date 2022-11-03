package week4day3;

public class Desktop extends Computer {
	public void DesktopSize() {
		System.out.println("16 inch");
	}
	public static void main(String[] args) {
		Desktop PC=new Desktop();
		PC.DesktopSize();
		PC.ComputerModel();
		System.out.println(PC);
	}

}
