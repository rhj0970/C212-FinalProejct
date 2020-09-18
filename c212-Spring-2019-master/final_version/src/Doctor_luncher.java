
import java.io.IOException;
import java.util.Scanner;



public class Doctor_luncher{
	public Doctor d;
	
	
 public static void main(String[] args) throws IOException {
	 
	 Scanner scan = new Scanner(System.in);
	 Doctor_Info di = new Doctor_Info();
	 
	 Hospital_Launcher hl = new  Hospital_Launcher();
  boolean run = false;
  
     di.load();
	 while(run == false){
	 System.out.print("ID : ");
	 di.setID();
  
	
  System.out.print("password : ");
  di.setPassword();
  
  if(di.d.checkID(di.getID())==true  && di.d.checkPW(di.getPassword())==true){
 	 run = true;
  		}
	 }
  while (run==true) {
	  System.out.println("========== Doctor information system ==========");
	  System.out.println("1. manage doctor information");
	  System.out.println("2. Doctor scedule"); 
	  System.out.println("3. Go back to main");
	  System.out.print("4. exit");
	  int selectNo = scan.nextInt();
   
   scan.nextLine();
   if (selectNo == 1)
	   di.main(args);
   else if (selectNo == 2) 
	   di.main(args);
   else if (selectNo == 3)
	   hl.main(args);
   else if (selectNo == 4)
    run = false;
  }
  System.out.println("Exit.");
 }
}