package assignments.test;

import java.util.Scanner;

import assignments.model.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer[] customers = new Customer[4];
		
		for (int i=0; i<customers.length; i++) {
			customers[i] = new Customer();
			takeCustomerValues(customers[i]);
			System.out.println("*********************************************************\n");
		}
		
		Customer temp = null;
//		for (int i = 0; i < customers.length; i++) {
//			for (int j = 0; j < customers.length-1; j++) {
//				if (customers[i].getName()>customers[j].getName()) {
//					temp=accounts[i];
//					accounts[i]=accounts[j];
//					accounts[j]=temp;
//				}
//			}
//		}
		
		for (int i = 0; i < customers.length; i++) {  
			for (int j = 0; j < customers.length-1; j++) {  
				if(customers[i].getName().compareTo(customers[j].getName())<0) {  
					temp = customers[i];  
					customers[i] = customers[j];  
					customers[j] = temp;  
				}  
			}  
		}  
		
		System.out.println("\nSorted Customer Details: ");
		for (int i=0; i<customers.length; i++) {
			System.out.println(customers[i]);
		}

	}
	
	public static void takeCustomerValues(Customer customer) {
		Scanner sc = new Scanner(System.in);
		String emailFormat = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String emailId = null;
		System.out.print("Enter ID: ");
		int custId = sc.nextInt();
		customer.setCustId(custId);
		
		System.out.print("Enter Name: ");
		String name = sc.next();
		customer.setName(name);
		
		do {
			System.out.print("Enter EmailID: ");
			emailId = sc.next();
			if (!emailId.matches(emailFormat)) {
				System.out.println("\nInvalid Email!!");
			}
		} while (!emailId.matches(emailFormat));
		customer.setEmailId(emailId);
		
		
		System.out.print("Enter Password: ");
		String password = sc.next();
		customer.setPassword(password);
		
		System.out.println(customer);
		
	}

}
