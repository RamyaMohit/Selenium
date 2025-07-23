package week3.day1;

public class Elements extends Button{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elements element1 = new Elements();
		//get the method webelement
		element1.setText("fieldset");
		//get the method of button
		element1.submit();
		
		//checkboxbutton 
		CheckBoxButton cb = new CheckBoxButton();
	    cb.click();
	    cb.submit();
	    cb.setText("buttonClick");
	    cb.clickCheckButton();
	    
	    //Radiobutton
	    RadioButton radioButton1  = new  RadioButton();
	    radioButton1.selectRadioButton();
	    radioButton1.submit();
	    radioButton1.setText("radiobuttonSelected");

	    
	    //TextField
	    TextField tf1 = new TextField();
	    tf1.getText(); 
	  
		
	}

}
