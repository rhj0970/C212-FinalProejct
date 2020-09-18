import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

//This class can view doctor's list
//Can access request schedule

public class patientLauncher {
	
	private String viewDoctorsList;
	private String viewDoctorsInfo;
	private String requestSchedule;
	
	
	public static void name() throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = new PrintWriter("longin.data", "UTF-8");
		
		System.out.println("Please Enter Username: ");
		String str = sc.nextLine();
		System.out.println("Please Enter your Password: ");
		String str2 = sc.nextLine();
		writer.write(str);
		writer.write(str2);
		writer.close();
		sc.close();
		
		

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		name();
		System.out.println("Login Successful, Welcome User");
		Scanner scan = new Scanner(System.in);
		requestSchedule a = new requestSchedule();
		Doctor_Info doctorInfo = new Doctor_Info();
		Doctor_Schedule schedule = new Doctor_Schedule();
		
	boolean run = true;
	while (run) {
		System.out.println("========== Patient System ==========");
		System.out.println("1 -- View Doctor's Information");
		System.out.println("2 -- View Doctor's Schedule");
		System.out.println("3 -- Make Patient's Appointment Request");
		System.out.println("4 -- Exit");
		
		int numSelect = scan.nextInt();
		
		
	scan.nextLine();
	if (numSelect == 1) {
		doctorInfo.main(args);
	}
	
	else if (numSelect == 2) {
		schedule.main(args);
	}
		
	else if (numSelect == 3) {
		a.main(args);
	}
		
	run = false;
	}
	System.out.println("Exited");
		//Will be able to view doctor's list 	
	}
}
