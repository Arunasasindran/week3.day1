package wee3.day1.bank;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();


	}
	
	public void deposit() {
		System.out.println("Deposit method inside Axis Bank");
	}

}
