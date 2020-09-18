package skeleton;

/* group : 20
 * mamber_name: sun jun eoh, Tae Yoon Choi,Zain Habib,Jason Ryu
 * date of last  fix: 03/26/2019
 * Assignment Name: Final project - Hospital_Launcher
 *  The class which the begining of intire system. 
*/


import java.util.Scanner;


public class Hospital_Launcher{
 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 // call each luncher to move other class
	 Doctor_Info d = new Doctor_luncher();
	 Assistant_Launcher a = new Assistant_Launcher();
	 Patient_Launcher p = new Patient_Launcher();
  boolean run = true; // if run become false, system will end.
  
  // this is entrance view of the system. until run become false, it will ask this question,
  // and depend on user input, it will move to other luncher of sysyem.
  while (run) {
	  System.out.println("----------------------------------------------------------");
	  System.out.println("Weclome to IU hospital system. Please choice your status.");
	  System.out.println("1. doctor");
	  System.out.println("2.Assistant");
	  System.out.println("3.Paitents");
	  System.out.println("4.Exit");
	  System.out.println("----------------------------------------------------------");
	  System.out.print("choiice > ");

   int selectNo = scan.nextInt();
   scan.nextLine();
   if (selectNo == 1)
	   d.main(args);
   
   else if (selectNo == 2)
	   a.main(args);
   else if (selectNo == 3)
	   p.main(args);
   else if (selectNo == 4)
	   new Doctor_Info();
    run = false;
    System.out.println("Exit.");
  }
  
 }
}