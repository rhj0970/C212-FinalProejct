import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.*;

// this class add/update doctor's info and schedule
public class Assistant_launcher{
  
	/*
  public static void name() throws FileNotFoundException, UnsupportedEncodingException {
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = new PrintWriter("longin.data", "UTF-8");
		
		System.out.println("Please Enter Assitant name: ");
		String str = sc.nextLine();
		System.out.println("Please Enter your Password: ");
		String str2 = sc.nextLine();
		writer.write(str);
		writer.write(str2);
		writer.close();
		sc.close();
  }
  */
  public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
  //name();
  Scanner scan = new Scanner(System.in);
  Doctor_Info a = new Doctor_Info();
  Doctor_Schedule b = new Doctor_Schedule();
  
 boolean run = true;
 while (run) {
  System.out.println("========== Assistant System ==========");
  System.out.println("1 -- Add/update Doctor's Information");
  System.out.println("2 -- Add/update Schedule");
  System.out.println("3 -- Exit");
  
  int numSelect = scan.nextInt();
  scan.nextLine();
  if (numSelect == 1) {
   a.main(args);
  }
 
 else if (numSelect == 2) {
  b.main(args);
 }
 
 run = false;
 }
 System.out.println("Successfully updated");

  
 }
   
}
