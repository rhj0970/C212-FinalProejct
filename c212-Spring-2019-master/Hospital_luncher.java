import java.io.IOException;
import java.util.Scanner;

public class Hospital_luncher{

 public static void main(String[] args) throws IOException {
	 Scanner scan = new Scanner(System.in);
	 Doctor_luncher d = new Doctor_luncher();
  boolean run = true;
  while (run) {
	  System.out.println("----------------------------------------------------------");
	  System.out.println("Welcome to IU hospital system. Please choice your status.");
	  System.out.println("1. doctor");
	  System.out.println("2.Assistant");
	  System.out.println("3.Paitents");
	  System.out.println("4.Exit");
	  System.out.println("----------------------------------------------------------");
	  System.out.print("choice > ");

   int selectNo = scan.nextInt();
   scan.nextLine();
   if (selectNo == 1)
	   d.main(args);
   
   else if (selectNo == 5)
	   new Doctor_Info();
    run = false;
    System.out.println("Exit.");
  }
  
 }
}
