import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

//Will take patient's appointment request
public class requestSchedule {
	
	private String patientName;
	private String doctorCategory;
	private String time;
	private static String patientRequest;
	
	
	//Constructor
	public requestSchedule() {
			
	}
	/*
	public static void login() {
		Scanner input = new Scanner(System.in);
		
		String patient1;
		String ;
		
		System.out.println();
	}
	*/
	
	public static void name() throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> k = new ArrayList<>();
		PrintWriter writer = new PrintWriter("patientInfo.data", "UTF-8");
		
		System.out.println("Please Enter your name: ");
		String str = sc.nextLine();
		
		writer.write(str);
		writer.close();
		sc.close();
	}
	public static void symptom() throws FileNotFoundException, UnsupportedEncodingException  {
		Scanner k = new Scanner(System.in);
		PrintWriter writer2 = new PrintWriter("symptom.data", "UTF-8");
		
		System.out.println("What symptoms are you experiencing: ");
		String str1 = k.nextLine();
		
		writer2.write(str1);
		writer2.close();
		k.close();
	}
	
	//Takes in and reads patient input	
	//Stores the request in data file which will then be funneled into Request Manager
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		//ArrayList<String> finalRequest = null;
		name();
		symptom();
		
		Scanner in = new Scanner(System.in); //reads input
		
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
		int numSelect = in.nextInt();
		
		PrintWriter writer = new PrintWriter("request.data", "UTF-8");
		in.nextLine();
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

	}

}


