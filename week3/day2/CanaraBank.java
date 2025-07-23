package week3.day2;

public abstract class CanaraBank implements Payments{
	
	public abstract void recordPaymentDetails();
	
	public void mandatory()
	{
		System.out.println("Kyc is mandatory");
	}

}
