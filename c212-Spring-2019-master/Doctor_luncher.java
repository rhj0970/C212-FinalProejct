
import java.util.Scanner;



public class Doctor_luncher{
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 Doctor_Info di = new Doctor_Info();
	 Hospital_luncher hl = new Hospital_luncher();
  boolean run = true;
  while (run) {
	  System.out.println("========== Doctor information system ==========");
	  System.out.println("1. Manage doctor information");
	  System.out.println("2. Doctor schedule"); 
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
