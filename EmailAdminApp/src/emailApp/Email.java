package emailApp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String email;
	private String companySuffix = "abcompany.com";
	private int mailboxCapacity = 500;
	private String alternateEmail;
	
	//Constructor to receive firstname and lastname
	
	public Email(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName );
	
	//Call a method to return department
		
		this.department = setDepartment(); 
		//System.out.println("Department is " + this.department);
		
	//Call a method that returns random password
		
		this.password = randomPassword(9);
		System.out.println("Your password is " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
				
		//System.out.println(email);
				
		
		
		
	}
	private String setDepartment() {
		System.out.print("Hi " + firstName + "\nDepartment Choices \n1 Sales\n2 Development\n3 Accounting\n0 None\nEnter the department\n");
		Scanner s = new Scanner(System.in);
		int depChoice = s.nextInt();
		if (depChoice == 1) { return "Sales";	}
		else if (depChoice == 2) { return "Dev";	}
		else if (depChoice == 3) { return "Accounts";	}
		else return "Not Valid";
		
	}
	
	//generate random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLabcdefghiklmn12345678!@#$";
		char[] password = new char[length];
		for(int i =0; i< length; i++) {
			
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
		}
		
		return new String(password);
		
	
	}
	
		
	//set mailbox capacity and alternate email
	
	public void setMailboxCapacity(int capacity) {
		 this.mailboxCapacity = capacity;
		
	}
		
	public void setalternateEmail(String email) {
		this.alternateEmail = email;
		System.out.println("Your alternate email is " + alternateEmail);
	}
	
	//Change the password
	
	public void setChangePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() { 
		return mailboxCapacity;
	}
	
	public String getalternateEmail() {
		return alternateEmail;
		
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nEMAIL ADDRESS: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}

}
