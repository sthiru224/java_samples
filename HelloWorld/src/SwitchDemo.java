public class SwitchDemo {
		   public static void main(String[] args) {
		      char grade = args[0].charAt(0);
		      System.out.print("Your grade is " + grade + " : ");
		      switch(grade) {
		         case 'A' :
		            System.out.println(" Excellent!"); 
		            break;
		         case 'B' :
			            System.out.println(" Well done!");
			           break;
		         case 'C' :
		            System.out.println(" Well done!");
		           // break;
		         case 'D' :
		            System.out.println(" You passed!");
		         case 'F' :
		            System.out.println(" Don't give up! Try again!");
		           // break;
		         default :
		            System.out.println(" Invalid grade!");
		      } //switch
		   }
}
