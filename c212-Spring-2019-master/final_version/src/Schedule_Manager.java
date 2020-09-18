
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;




public class Schedule_Manager {
	Scanner console = new Scanner(System.in);
	
	
	
	
	
	
	public String compare() {
		
		
		
		
		return null;
	}
	
	
	public static void main(String[] args) throws IOException{ 
		Scanner scan = new Scanner(new File("request.data")); // data that's from patient's request
		Scanner scan2 = new Scanner(new File("schedule.data")); // data that's from doctor's schedule
		ArrayList<String> pastAppointment = new ArrayList<>(); /// store value of past patient's appointment
	
		////// Basically, this two lines of codes converts scanner files to string
		String contents = scan.useDelimiter("\\Z").next(); // converts (patients request) scanner files to string
		String contents2 = scan2.useDelimiter("\\Z").next(); //converts (doctors available schedule) scanner files to string 
		scan.close();
		scan2.close();
		
	// Print the list so user can actually see in console
	System.out.println(contents +"\n");
	System.out.println(contents2);

	if (contents2.contains(contents)) {
		System.out.println("Schedule is available do you wish to approve?: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Select Yes or No: ");
		String k = in.nextLine();
		if (k.equals("Yes")) {
			System.out.println("Thank you, Patient appintment request has been successfully processed");
			pastAppointment.add(contents);
			}
		else if (k.equals("No")) {
			System.out.println("The patients request has been denied");
			}
		}
	
	else if(!contents2.contains(contents)) {
		System.out.println("Sorry, the schedule time that you requested is not available. Please pick another time");
	}
	else {
		System.out.println("System error");
	}
	
	System.out.println("Patient's pastAppointments");
	System.out.println(pastAppointment); // This prints out the list of past appointments
}
}

