package Resume_DataSource;

import java.util.HashMap;
import java.util.Scanner;

public class GetData {
	
	static HashMap<String, String> dataSource = new HashMap<>();
	
	public void userData() {
		
		
		Scanner get=new Scanner(System.in);
		
	    System.out.println("Enter Name");
	    
		String Name = get.nextLine();  // Read user input
		
		System.out.println("Enter Email");
	    
		String Email = get.nextLine();  // Read user input

		System.out.println("Enter Phone Number");
	    
		String PhoneNo = get.nextLine();  // Read user input
		
		System.out.println("Enter Summary In 200 Words");
	    
		String Summary = get.nextLine();  // Read user input
		
		
		

	
		
		
	    try {
			dataSource.put("Name",Name);
			dataSource.put("Email",Email);
			dataSource.put("PhoneNo",PhoneNo);
			dataSource.put("Summary",Summary);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	public  HashMap<String, String> getData() {
		return dataSource;
		
	}
}
