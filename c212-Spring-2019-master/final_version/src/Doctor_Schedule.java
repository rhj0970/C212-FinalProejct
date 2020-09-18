/* This class add doctor's schedule
 * and read and write doctor's schedule through schedule.data
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor_Schedule{


  
  public Doctor_Schedule() {
  
  }
  
  public static void main(String[] args) throws IOException  {
    //ArrayList<String> addSchedule = null;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Please add your available schedule");
    System.out.println("1 -- 8:00 am - 9:00 am");
    System.out.println("2 -- 9:00 am - 10:00 am");
    System.out.println("3 -- 10:00 am - 11:00 am");
    System.out.println("4 -- 11:00 am - 12:00 pm");
    System.out.println("5 -- 12:00 pm - 1:00 pm");
    System.out.println("6 -- 1:00 pm - 2:00 pm");
    System.out.println("7 -- 2:00 pm - 3:00 pm");
    System.out.println("8 -- 3:00 pm - 4:00 pm");
    System.out.println("9 -- 4:00 pm - 5:00 pm");
    
    System.out.println("please enter schedule: ");
    
    int selectNum = in.nextInt();
  
    in.nextLine();
    
    FileWriter writer = null;
	try {
		writer = new FileWriter("schedule.data", true);
		
		
		
	} 
	
	
	catch (IOException e) 
	{
		System.out.println("System error, please try again");
		e.printStackTrace();
	}
    

    
    
 
  if(selectNum == 1) {
   writer.append("8:00 am - 9:00 am\r\n");
  }
  else if(selectNum == 2) {
   writer.write("9:00 am - 10:00 am\r\n");
  }
  else if(selectNum == 3) {
   writer.write("10:00 am - 11:00 am\r\n");
  }
  else if(selectNum == 4) {
   writer.write("11:00 am - 12:00 pm\r\n");
  }
  else if(selectNum == 5) {
   writer.write("12:00 pm - 1:00 pm\r\n");
  }
  else if(selectNum == 6) {
   writer.write("1:00 pm - 2:00 pm\r\n");
  }
  else if(selectNum == 7) {
   writer.write("2:00 pm - 3:00 pm\r\n");
  }
  else if(selectNum == 8) {
   writer.write("3:00 pm - 4:00 pm\r\n");
  }
  else if(selectNum == 9) {
   writer.write("4:00 pm - 5:00 pm\r\n");
  }
  writer.close();
  }
}
