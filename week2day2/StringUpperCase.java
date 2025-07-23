package week2day2;

public class StringUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "changeme";
		char[] charArr = test.toCharArray();
		for(int i=0;i < charArr.length;i++)
		{
			if(i%2 != 0)
			{
				System.out.println(Character.toUpperCase(charArr[i]));
			}else {
				System.out.println(charArr[i]);
			}
		}
	}

}
