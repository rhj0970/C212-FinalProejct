import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
	// name and licence number ArrayList
	private ArrayList<String> nameList;
	private ArrayList<String> IDList;
	private ArrayList<String> passwordList;
	private ArrayList<String> specialtyList;
	private ArrayList<String> availabilityList;
	private ArrayList<String> PhoneList;
	private ArrayList<String> EmailList;
	private static Doctor dObj;

	private Doctor() {
	}

	public static Doctor genStuObj() {
		if (dObj == null) {
			dObj = new Doctor();
			// create array list.
			dObj.nameList = new ArrayList<String>();
			dObj.IDList = new ArrayList<String>();
			dObj.passwordList = new ArrayList<String>();
			dObj.specialtyList = new ArrayList<String>();
			dObj.availabilityList = new ArrayList<String>();
			dObj.PhoneList = new ArrayList<String>();
			dObj.EmailList = new ArrayList<String>();
		}
		return dObj;
	}
	
	
		
		/*
		
		 while(passID= false) {
		if (Doctor.dObj.IDList.size() != 0) {
			for (int i = 0; i < Doctor.dObj.IDList.size(); ++i) {
				if (ID.equals(Doctor.dObj.IDList.get(i))) {
					
					Doctor.dObj.passwordList.get(i);
					passID = true;
					break;
				}
			}
		} else {
			System.out.println("\n* " + ID + "is not exixt.\n");
		}
		 }
		 while(passPW= false) {
		System.out.print("type password.");
		input_pw = scan.nextLine();
		if(!input_pw.equals(password)) {
			System.out.println("wrong password");
		    System.out.println("* please type again.");
		  
		}
		else {
			passPW = true;
		}
		 }
		*/
		public boolean checkID(String ID){
			String input_pw = null;
			boolean pass = false;
			boolean passPW = false;
			Scanner scan = new Scanner(System.in);
			
			if (Doctor.dObj.IDList.size() != 0) {
				for (int i = 0; i < Doctor.dObj.IDList.size(); ++i) {
					if (ID.equals(Doctor.dObj.IDList.get(i))) {
						
						System.out.println("correct_ID : " + Doctor.dObj.IDList.get(i));
						break;
						
						}
					
				}
			} else {
				System.out.println("\n* " + ID + "is not correct or exist.\n");
				return false;
			}
			
			return true;
			
		}
		
		public boolean checkPW(String password){
			String input_pw = null;
			boolean pass = false;
			boolean passPW = false;
			Scanner scan = new Scanner(System.in);
			
			if (Doctor.dObj.passwordList.size() != 0) {
				for (int i = 0; i < Doctor.dObj.passwordList.size(); ++i) {
					if (password.equals(Doctor.dObj.passwordList.get(i))) {
						
						System.out.println("correct password : " + Doctor.dObj.passwordList.get(i));
						break;
						
						}
					
					
				}
			} else {
				System.out.println("\n* " + password + "is not correct or exist.\n");
				return false;
			}
			return true;
		}
	
	public void loadDoctor(String ID, String password, String name, String specialty, String availability, String Phone,
			String Email) {
				// check licence number is duplicated
				boolean Flag = true;
				if (Doctor.dObj.IDList.size() != 0) {
					for (int i = 0; i < Doctor.dObj.IDList.size(); ++i) {
						if (ID.equals(Doctor.dObj.IDList.get(i))) {
							
							Flag = false;
						}
					}
				}
				if (Flag) {
					this.nameList.add(name);
					this.IDList.add(ID);
					this.passwordList.add(password);
					this.specialtyList.add(specialty);
					this.availabilityList.add(availability);
					this.PhoneList.add(Phone);
					this.EmailList.add(Email);
				}
			}
			
		
	public void addDoctor(String ID, String password, String name, String specialty, String availability, String Phone,
			String Email) {
		// check licence number is duplicated
		boolean Flag = true;
		if (Doctor.dObj.IDList.size() != 0) {
			for (int i = 0; i < Doctor.dObj.IDList.size(); ++i) {
				if (ID.equals(Doctor.dObj.IDList.get(i))) {
					System.out.println("\n* Already registered.");
					System.out.println("* information : " + Doctor.dObj.IDList.get(i) + " : "
							+ Doctor.dObj.nameList.get(i) + "\r\n");
					Flag = false;
				}
			}
		}
		if (Flag) {
			this.nameList.add(name);
			this.IDList.add(ID);
			this.passwordList.add(password);
			this.specialtyList.add(specialty);
			this.availabilityList.add(availability);
			this.PhoneList.add(Phone);
			this.EmailList.add(Email);
		}
	}

	
	public void delDoctor(String ID) {
		if (Doctor.dObj.IDList.size() != 0) {
			for (int i = 0; i < Doctor.dObj.IDList.size(); ++i) {
				if (ID.equals(Doctor.dObj.IDList.get(i))) {
					Doctor.dObj.nameList.remove(i);
					Doctor.dObj.IDList.remove(i);
					Doctor.dObj.passwordList.remove(i);
					Doctor.dObj.specialtyList.remove(i);
					Doctor.dObj.availabilityList.remove(i);
					Doctor.dObj.PhoneList.remove(i);
					Doctor.dObj.EmailList.remove(i);
					System.out.println("\n* information deleted.\n");
				}
			}
		} else {
			System.out.println("\n* no information to delete.\n");
		}

	}

	public void searchDoctor(String ID) {
		if (Doctor.dObj.IDList.size() != 0) {
			for (int i = 0; i < Doctor.dObj.IDList.size(); ++i) {
				if (ID.equals(Doctor.dObj.IDList.get(i))) {
					System.out.println("name: " + Doctor.dObj.nameList.get(i));
					System.out.println("ID : " + Doctor.dObj.IDList.get(i));
					System.out.println("specialty: " + Doctor.dObj.specialtyList.get(i));
					System.out.println("availability : " + Doctor.dObj.specialtyList.get(i));
					System.out.println("Phone: " + Doctor.dObj.PhoneList.get(i));
					System.out.println("Email : " + Doctor.dObj.EmailList.get(i));
					break;
				}
			}
		} else {
			System.out.println("\n* " + ID + "is not exixt.\n");
		}
	}

	public void printDoctor() {
		if (Doctor.dObj.IDList.size() < 1) {
			System.out.println("\n* No registerd doctor exixt.");
			System.out.println("* use it after registered.\n");
		} else {
			System.out.println("-------------- Doctor List --------------");
			for (int i = 0; i < Doctor.dObj.IDList.size(); ++i) {
				System.out.println("name:" + Doctor.dObj.nameList.get(i) + "\n"
						+ "ID:" + Doctor.dObj.IDList.get(i) 
						+ "\n" + "password:" + Doctor.dObj.passwordList.get(i)
						+ "\n" + "specialty:" + Doctor.dObj.specialtyList.get(i)
						+ "\n" + "availability:" + Doctor.dObj.availabilityList.get(i) + "\n" + "Phone:"
						+ Doctor.dObj.PhoneList.get(i) + "\n" + "email: " + Doctor.dObj.EmailList.get(i));
				System.out.println("---------------------------------------");
			}
			System.out.println();
		}
	}
}
