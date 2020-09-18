import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
	// name and licence number ArrayList
	private ArrayList<String> nameList;
	private ArrayList<String> LicenceNumberList;
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
			dObj.LicenceNumberList = new ArrayList<String>();
			dObj.specialtyList = new ArrayList<String>();
			dObj.availabilityList = new ArrayList<String>();
			dObj.PhoneList = new ArrayList<String>();
			dObj.EmailList = new ArrayList<String>();
		}
		return dObj;
	}
	
	public void loadDoctor(String LicenceNumber, String name, String specialty, String availability, String Phone,
			String Email) {
				// check licence number is duplicated
				boolean Flag = true;
				if (Doctor.dObj.LicenceNumberList.size() != 0) {
					for (int i = 0; i < Doctor.dObj.LicenceNumberList.size(); ++i) {
						if (LicenceNumber.equals(Doctor.dObj.LicenceNumberList.get(i))) {
							
							Flag = false;
						}
					}
				}
				if (Flag) {
					this.nameList.add(name);
					this.LicenceNumberList.add(LicenceNumber);
					this.specialtyList.add(specialty);
					this.availabilityList.add(availability);
					this.PhoneList.add(Phone);
					this.EmailList.add(Email);
				}
			}
			
		
	public void addDoctor(String LicenceNumber, String name, String specialty, String availability, String Phone,
			String Email) {
		// check licence number is duplicated
		boolean Flag = true;
		if (Doctor.dObj.LicenceNumberList.size() != 0) {
			for (int i = 0; i < Doctor.dObj.LicenceNumberList.size(); ++i) {
				if (LicenceNumber.equals(Doctor.dObj.LicenceNumberList.get(i))) {
					System.out.println("\n* Already registered.");
					System.out.println("* information : " + Doctor.dObj.LicenceNumberList.get(i) + " : "
							+ Doctor.dObj.nameList.get(i) + "\r\n");
					Flag = false;
				}
			}
		}
		if (Flag) {
			this.nameList.add(name);
			this.LicenceNumberList.add(LicenceNumber);
			this.specialtyList.add(specialty);
			this.availabilityList.add(availability);
			this.PhoneList.add(Phone);
			this.EmailList.add(Email);
		}
	}

	
	public void delDoctor(String LicenceNumber) {
		if (Doctor.dObj.LicenceNumberList.size() != 0) {
			for (int i = 0; i < Doctor.dObj.LicenceNumberList.size(); ++i) {
				if (LicenceNumber.equals(Doctor.dObj.LicenceNumberList.get(i))) {
					Doctor.dObj.nameList.remove(i);
					Doctor.dObj.LicenceNumberList.remove(i);
					Doctor.dObj.LicenceNumberList.remove(i);
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

	public void searchDoctor(String LicenceNumber) {
		if (Doctor.dObj.LicenceNumberList.size() != 0) {
			for (int i = 0; i < Doctor.dObj.LicenceNumberList.size(); ++i) {
				if (LicenceNumber.equals(Doctor.dObj.LicenceNumberList.get(i))) {
					System.out.println("name: " + Doctor.dObj.nameList.get(i));
					System.out.println("licence number : " + Doctor.dObj.LicenceNumberList.get(i));
					System.out.println("specialty: " + Doctor.dObj.specialtyList.get(i));
					System.out.println("availability : " + Doctor.dObj.specialtyList.get(i));
					System.out.println("Phone: " + Doctor.dObj.PhoneList.get(i));
					System.out.println("Email : " + Doctor.dObj.EmailList.get(i));
					break;
				}
			}
		} else {
			System.out.println("\n* " + LicenceNumber + "is not exixt.\n");
		}
	}

	public void printDoctor() {
		if (Doctor.dObj.nameList.size() < 1) {
			System.out.println("\n* No registerd doctor exixt.");
			System.out.println("* use it after registered.\n");
		} else {
			System.out.println("-------------- Doctor List --------------");
			for (int i = 0; i < Doctor.dObj.nameList.size(); ++i) {
				System.out.println("name:" + Doctor.dObj.nameList.get(i) + "\n" + "licence:"
						+ Doctor.dObj.LicenceNumberList.get(i) + "\n" + "specialty:" + Doctor.dObj.specialtyList.get(i)
						+ "\n" + "availability:" + Doctor.dObj.availabilityList.get(i) + "\n" + "Phone:"
						+ Doctor.dObj.PhoneList.get(i) + "\n" + "email: " + Doctor.dObj.EmailList.get(i));
				System.out.println("---------------------------------------");
			}
			System.out.println();
		}
	}
}
