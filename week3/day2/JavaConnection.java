package week3.day2;

public class JavaConnection implements DatabseConnection{

	@Override
	public void connect() {
		System.out.println("Database conencted");
		
	}

	@Override
	public void disconnect() {
		System.out.println(" Databse disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Database is updated");
		
	}
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}

}
