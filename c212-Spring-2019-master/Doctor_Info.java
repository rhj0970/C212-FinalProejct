

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;


public class Doctor_Info {

 private BufferedReader in;          // variable for get input
 private int inputNum;               // user input menu
 private String name;                // doctor name
 private String LicenseNumber;  	// doctor licence number
 private String specialty; 			// doctor specialization
 private String availability;		// not specialization but availabile 
 private String Phone;				// contact information. phone number
 private String Email;				// email
 public Doctor d;                  // Doctor class variable
 private static final int LICENCE_NUM_LEN = 10;   // lenghth of licence number
 
 
 
 
 // in/output, menu selction, Doctor object implement
 public Doctor_Info() {
	 in = new BufferedReader(new InputStreamReader(System.in));
	 
	
  inputNum = 0;
  d = Doctor.genStuObj();
 }
 
 // 
 public void setInputNum() throws IOException {
  this.inputNum = Integer.parseInt(in.readLine());
 }
 
 public int getInputNum() {
  return this.inputNum;
 }
 //*private int inputNum;               // user input menu
 //private String name;                // doctor name
 //private String LicenseNumber;  	// doctor licence number
 //private String specialty; 	//
 //private String availability;
 //private String Phone;
 //private String Email; *//
 
 public void setName() throws IOException {
  this.name = in.readLine();
 }
 
 public String getName() {
  return this.name;
 }
 
 public void setspecialty() throws IOException {
	  this.specialty = in.readLine();
	 }
	 
 public String getspecialty() {
	  return this.specialty;
	 }
	 
 	public void setavailability() throws IOException {
		  	String rn = null;
		  	rn = in.readLine();
		  	rn = rn.replaceAll(", ", "/");
		  	rn =rn.replaceAll(",", "/");
 			this.availability = rn;
		 }
		 
	public String getavailability() {
		  return this.availability;
		 }
	public void setPhone() throws IOException {
			  this.Phone = in.readLine();
		}
			 
	public String getPhone() {
			  return this.Phone;
			 }
	public void setEmail() throws IOException {
				  this.Email = in.readLine();
				 }
				 
	public String getEmail() {
				  return this.Email;
				 }
 public void setLicenseNumber() throws IOException {
  // only accept value when the length is right.
  while(true) {
   this.LicenseNumber = in.readLine();
   if(this.LicenseNumber.length() != LICENCE_NUM_LEN) {
    System.out.println("The right lenghth of Doctor licence number is" + LICENCE_NUM_LEN);
    System.out.println("* please type again.");
    System.out.print("License number : ");
   } else {
    break;
   }
  }
 }
 public void load() {
	 File filename = new File("dr_info.data");

	 ArrayList<Doctor_Info> Info_list = new ArrayList<Doctor_Info>();
	 FileReader in = null;
     BufferedReader in2 = null;
	 FileWriter out = null;
	 PrintWriter out2 = null;
	 
	 Doctor_Info m = new Doctor_Info();
	 
		
	//when first time main method started, it automatically load data from data file use code 
	 // under this line. 
	 try {
         in = new FileReader(filename);
         in2 = new BufferedReader(in);
         String line = null;
         Info_list.clear();
         while(true) {
                 line = in2.readLine();
                 if (line == null)
                         break;
                 //for this while loop, read line from text file, and split data use split,
                 //and put it on array list on the follwing order
                 String[] values = line.split(",");
                 m.d.loadDoctor(values[0],values[1],values[2],values[3],values[4],values[5]);
                 
                                 
         }
         System.out.println("data load is finish!");
 } catch (Exception e) {
         System.out.println("data load error");
 } finally {
         try {in2.close();} catch(Exception e) {}
         try {in.close();} catch(Exception e) {}
 }
 }

 public String getLicenseNumber() {
  return this.LicenseNumber;
 }
 
 
 
 
 public static void main(String[] args){
	 FileWriter out = null;
	 PrintWriter out2 = null;
	 Doctor_Info m = new Doctor_Info();
	 
	 m.load();
 
	 

  while (true) {
   try {
    // print menu
    printMenu();
    // get a input number
    m.setInputNum();
    
    switch (m.getInputNum()) {
    case 1:
     System.out.print("name : ");
     m.setName();
     System.out.print("licence : ");
     m.setLicenseNumber();
     System.out.print("specialty : ");
     m.setspecialty();
     System.out.print("availability : ");
     m.setavailability();
     System.out.print("phone : ");
     m.setPhone();
     System.out.print("email : ");
     m.setEmail();
     
     // add all data get adove to array list use addDoctor method.
     m.d.loadDoctor(m.getLicenseNumber() ,m.getName(), m.getspecialty(),m.getavailability(),m.getPhone(),m.getEmail());
     
     // add all data to empty arraylist for add it on data file
       // 
     // part for save data insiade of file, after turn off console
     try {
    	 out = new FileWriter("dr_info.data",true);
         out2 = new PrintWriter(out);
         
        	out2.printf("%1$s,%2$s,%3$s,%4$s,%5$s,%6$s\r\n",
        			m.getLicenseNumber(),m.getName() ,m.getspecialty(),
        	 m.getavailability(),m.getPhone(),m.getEmail());
        	 
        
         
         System.out.println("saved!");
 } catch (Exception e) {
         System.out.println("error to save file!");
 } finally {
         if (out2 != null) 
         out2.close();
 try {out.close();} catch(Exception e) {}
 }
     
     
     break;
    case 2:   	
        System.out.print("licence : ");
        m.setLicenseNumber();
        String del_line = m.getLicenseNumber();
        System.out.println(del_line);
        m.d.delDoctor(del_line);
        try {
            String line;
                    
            BufferedReader br=new BufferedReader(new FileReader(new File("dr_info.data")));
            
            File file = new File("dr_info.data");
            
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            while((line=br.readLine())!=null) {
             if(line.indexOf(del_line)<0){
              bw.write(line);
              bw.write("\r\n");
             }
             
             bw.flush();
            } 
            bw.close();
            fw.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem reading file.");
		
		}
        break;
		
	

        
    case 3:
     System.out.print("licence : ");
     m.setLicenseNumber();
     m.d.searchDoctor(m.getLicenseNumber());
     break;
    case 4:
     m.d.printDoctor();
     break;
    case 5 :
     System.out.println("Exit program.");
     System.exit(0);
     break;
    default:
     throw new Exception();
    }
    m.load();
   // exception if number is not in 1~5
   } catch (Exception e) {
    System.out.println("\n ====================");
    System.out.println("Wrong input.");
    System.out.println("press number on list");
    System.out.println(" ====================\n");
   }
  }
}
 public static void printMenu() {
  System.out.println("========== Doctor information system ==========");
  System.out.println("1. Add doctor");
  System.out.println("2. Delete doctor");
  System.out.println("3. Search doctor");
  System.out.println("4. Doctor List");
  System.out.println("5. exit");
  System.out.println("※data is not saved after finish.");
  System.out.print("input : ");
 }
 
 

}
