package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
        // Call methods from Library class
        String title = lib.addBook("Java Selenium");
        System.out.println("Added Book Title: " + title);
        lib.issueBook();
	}

}
