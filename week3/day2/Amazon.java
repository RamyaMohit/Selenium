package week3.day2;

public class Amazon extends CanaraBank{

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery accepted");		
	}

	@Override
	public void upiPayments() {
		System.out.println("Upi payments accepted");		
		
	}

	@Override
	public void cardPayments() {
		System.out.println("cardPayments accepted");		
	}

	@Override
	public void internetBanking() {
		
		System.out.println("InternetBanking accepted");		

	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Every payments has been recorded");		
	}
	
	public void mandatory()
	{
		super.mandatory();
		System.out.println("mandatory COD");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amazon amazon = new Amazon();
		amazon.cashOnDelivery();
		amazon.upiPayments();
		amazon.cardPayments();
		amazon.internetBanking();
		amazon.recordPaymentDetails();
		
	}

}
