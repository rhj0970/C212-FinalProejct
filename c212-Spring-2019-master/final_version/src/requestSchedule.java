import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

//Will take patient's appointment request
public class requestSchedule {
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
	
	
	//Constructor
	public requestSchedule() {
		in = new BufferedReader(new InputStreamReader(System.in));
		this.IDList = new ArrayList<String>();
		this.passwordList = new ArrayList<String>();
		
			
	}
	/*
	public static void login() {
		Scanner input = new Scanner(System.in);
		
		String patient1;
		String ;
		
		System.out.println();
	}
	*/
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
	
	public static void name() throws FileNotFoundException, UnsupportedEncodingException {
		//Scanner sc = new Scanner(System.in);
		ArrayList<String> k = new ArrayList<>();
		PrintWriter writer = new PrintWriter("patientInfo.data", "UTF-8");
		
		System.out.println("Please Enter your name: ");
		String str = sc.nextLine();
		
		writer.write(str);
		writer.close();
		//sc.close();
	}
	public static void symptom() throws FileNotFoundException, UnsupportedEncodingException  {
		//Scanner k = new Scanner(System.in);
		PrintWriter writer2 = new PrintWriter("symptom.data", "UTF-8");
		
		System.out.print("What symptoms are you experiencing: ");
		//String str1 = k.nextLine();
		String str1 = sc.nextLine();
		
		writer2.write(str1);
		writer2.close();
		//k.close();
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
	
	//Takes in and reads patient input	
	//Stores the request in data file which will then be funneled into Request Manager
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		//ArrayList<String> finalRequest = null;
		name();
		symptom();
		IDandPW();
		
		//Scanner in = new Scanner(System.in); //reads input
		
		System.out.println("Please choose a time that you would like to set up an appointment?");
		System.out.println("1 -- 8:00 am - 9:00 am");
		System.out.println("2 -- 9:00 am - 10:00 am");
		System.out.println("3 -- 10:00 am - 11:00 am");
		System.out.println("4 -- 11:00 am - 12:00 pm");
		System.out.println("5 -- 12:00 pm - 1:00 pm");
		System.out.println("6 -- 1:00 pm - 2:00 pm");
		System.out.println("7 -- 2:00 pm - 3:00 pm");
		System.out.println("8 -- 3:00 pm - 4:00 pm");
		System.out.println("9 -- 4:00 pm - 5:00 pm");
		//int numSelect = in.nextInt();
		int numSelect = sc.nextInt();
		
		PrintWriter writer = new PrintWriter("request.data", "UTF-8");
		//in.nextLine();
		sc.nextLine();
		if(numSelect == 1) {
			writer.write("8:00 am - 9:00 am");
		}
		else if(numSelect == 2) {
			writer.write("9:00 am - 10:00 am");
		}
		else if(numSelect == 3) {
			writer.write("10:00 am - 11:00 am");
		}
		else if(numSelect == 4) {
			writer.write("11:00 am - 12:00 pm");
		}
		else if(numSelect == 5) {
			writer.write("12:00 pm - 1:00 pm");
		}
		else if(numSelect == 6) {
			writer.write("1:00 pm - 2:00 pm");
		}
		else if(numSelect == 7) {
			writer.write("2:00 pm - 3:00 pm");
		}
		else if(numSelect == 8) {
			writer.write("3:00 pm - 4:00 pm");
		}
		else if(numSelect == 9) {
			writer.write("4:00 pm - 5:00 pm");
		}
		

		writer.close();
		sc.close();
	}

}