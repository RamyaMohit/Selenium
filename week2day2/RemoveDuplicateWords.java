package week2day2;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
	
		  String text = "We learn Java basics as part of java sessions in java week1";
	      String[] myArray = text.split(" ");
	      int count = 0;
	      
	      for (int i = 0; i < myArray.length; i++) {
	            // Skip if already marked as empty (duplicate)
	           if (myArray[i].equals("")) continue;

	            for (int j = i + 1; j < myArray.length; j++) {            
	                if (myArray[i].equalsIgnoreCase(myArray[j])) {
	                	myArray[j] = ""; 
	                
	                    count++;
	                }
	            }
	        }
	      
	   
	        for (String word : myArray) {
	            if (!word.equals("")) {
	                System.out.print(word + " ");
	            }
	        }
	        
	        if (count > 0) {
	            System.out.println("\nNumber of duplicate words found: " + count);
	        } else {
	            System.out.println("\nNo duplicate words found.");
	        }
	}
	
}

