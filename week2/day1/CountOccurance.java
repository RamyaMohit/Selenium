package week2.day1;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "TestLeaf";
		char[] nameArr = name.toCharArray();
		int count = 0;
		char targetChar = 'e';
		
		for(int i=0;i < nameArr.length;i++)
		{
			if(nameArr[i] == targetChar)
			{
				count++;
			}
		}
		
		System.out.println("Number of occurance of e is:" + count);
		
	}

}
