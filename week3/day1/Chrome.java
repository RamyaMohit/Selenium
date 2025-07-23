package week3.day1;

public class Chrome extends Browser{
	
	public void openIncognito()
	{
		System.out.println("Incognito window opened");
	}
	
	public void clearCache()
	{
		System.out.println("Cache is cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome chrome1 = new Chrome();
		chrome1.openURL();
		chrome1.openIncognito();
		System.out.println(chrome1.browserName);
	}

}
