package week3.day1;

public class APIClient {

	public void sendRequest(String endpoint)
	{
		System.out.println("Request end point is:" + endpoint);
	}
	
	public void sendRequest(String endpoint , String requestBody , boolean requestStatus)
	{
		System.out.println("endpoint is:" + endpoint + "Request body is:" + requestBody + "requestStatus is: "+ requestStatus);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient apiclient1 = new APIClient();
		apiclient1.sendRequest("requestURL");
		apiclient1.sendRequest("OpenRequest" , "Content" , true);
	}

}
