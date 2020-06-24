
public class TwoDimentional {

	
	
	
	public static void main(String[] args) {

		// Initialize using Method 1
		
		int i,j;
		int[][] Student_Marks1 = new int[2][3];
		
		Student_Marks1[0][0] = 10; // Initializing Array elements at position [0][0]
		Student_Marks1[0][1] = 15; // Initializing Array elements at position [0][1]
		Student_Marks1[0][2] = 20; // Initializing Array elements at position [0][2]
		Student_Marks1[1][0] = 20; // Initializing Array elements at position [1][0]
		Student_Marks1[1][1] = 25; // Initializing Array elements at position [1][1]
		Student_Marks1[1][2] = 30; // Initializing Array elements at position [1][2]


		System.out.println(" Student_Mark1 " + Student_Marks1);

		for (i = 0; i < 2; i++) {
		     for (j = 0; j < 3; j++) {
		    	 	System.out.format (" Value 4.2%d ", Student_Marks1[i][j]);
		     }
		     System.out.println(); 
		}
		
		// Initialize using Method 2
		
		int[][] Student_Marks2 = { 
									{1, 2, 3}, 
									{3, 4, 5} 
								};
		System.out.println(" Student_Mark2 " + Student_Marks2);

		for (i = 0; i < 2; i++) {
		     for (j = 0; j < 3; j++) {
		    	 	System.out.format("%d ", Student_Marks2[i][j]);
		     }
		     System.out.println(); 
		}
		
		// Initialize using Method 3
		int[][] Student_Marks3 = new int[2][3];
		for (i = 0; i < 2 ; i++) {
			for (j = 0; j < 3; j++) {
				Student_Marks3[i][j] = i*j;
			}
		 }	
			System.out.println(" Student_Mark3 " + Student_Marks3);
		for (i = 0; i < 2; i++) {
		     for (j = 0; j < 3; j++) {
		    	 	System.out.format("%d ", Student_Marks3[i][j]);
		     }
		     System.out.println(); 
		}
			


		
			
	} //main
} //class
