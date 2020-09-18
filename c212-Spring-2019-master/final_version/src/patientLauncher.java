import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

//This class can view doctor's list
//Can access request schedule

public class patientLauncher {
	public Doctor d;
	private BufferedReader in;
	private String patientName;
	private String ID;  
	private String password;
	private ArrayList<String> IDList;
	private ArrayList<String> passwordList;
	private String doctorCategory;
	private String time;
	private static String patientRequest;
	

	private static Scanner sc = new Scanner(System.in);
	
	public patientLauncher() {
		in = new BufferedReader(new InputStreamReader(System.in));
		this.IDList = new ArrayList<String>();
		this.passwordList = new ArrayList<String>();
		
			
	}
	 public void setID() throws IOException {
		 this.ID = in.readLine();
	 }
	 public String getID() {
		  return this.ID;
		 }
	 public void setPassword() throws IOException {
		// only accept value when the length is right.
		  while(true) {
		   this.password = in.readLine();
		   if(this.password.length() <= 8) {
		    System.out.println("The right lenghth of password is 8 char");
		    System.out.println("* please type again.");
		    System.out.print("password : ");
		   } else {
		    break;
		   }
		  }
		 }
		 
		 public String getPassword() {
		  return this.password;
		 }
	
	public static void IDandPW() throws FileNotFoundException, UnsupportedEncodingException  {
		//Scanner k = new Scanner(System.in);
		PrintWriter writer3 = new PrintWriter("patient_IDPW.data", "UTF-8");
		
		System.out.println("ID: ");
		//String str2 = k.nextLine();
		String str2 = sc.nextLine();

		System.out.println("Password: ");
		String str3 = sc.nextLine();
		
		writer3.printf("%1$s,%2$s\r\n",str2,str3);
		writer3.close();
		//k.close();
	}

		

	public static void main(String[] args) throws IOException {
		Doctor_Info di = new Doctor_Info();
		IDandPW();
		
		requestSchedule abc = new requestSchedule();
		Doctor_Info doctorInfo = new Doctor_Info();
		Doctor_Schedule schedule = new Doctor_Schedule();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////
	boolean run = true;
	boolean pass = true;
	 
	 /* 
     di.load();
	 while(pass == false){
	 System.out.print("ID : ");
	 di.setID();
  	
	
  System.out.print("password : ");
  doctorInfo.setPassword();
  */
  if(doctorInfo.d.checkID(doctorInfo.getID())==true  && doctorInfo.d.checkPW(doctorInfo.getPassword())==true){
 	 pass = true;
  		}
	//while (run == true) {
		System.out.println("========== Patient System ==========");
		System.out.println("1 -- View Doctor's Information");
		System.out.println("2 -- View Doctor's Schedule");
		System.out.println("3 -- Make Patient's Appointment Request");
		System.out.println("4 -- Exit");
		
		int numSelect = sc.nextInt();
		
		
	sc.nextLine();
	if (numSelect == 1) {
		doctorInfo.main(args);
	}
	
	else if (numSelect == 2) {
		schedule.main(args);
	}
		
	else if (numSelect == 3) {
		abc.main(args);
	}
		
	run = false;
	System.out.println("Exited");
	}
	
		//Will be able to view doctor's list 	


}

