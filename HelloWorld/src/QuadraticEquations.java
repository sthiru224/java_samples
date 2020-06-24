import java.io.BufferedReader;
import java.io.FileReader;

public class QuadraticEquations {
	public static void main(String[] args) {
		String[] arg= new String[100];
		String str;
		char chrs;
        int j=-1;
		double descriminant,sqrt_descriminant,ans_pos, ans_neg,descriminant_pos;
		try {
		    BufferedReader in = new BufferedReader(new FileReader("/Users/swetha/Documents/Java/Begin/HelloWorld/src/data.txt"));
		    while ((str = in.readLine()) != null) {
		    		j++;
		    		arg[j]="";
			    	System.out.print(str);
				System.out.println(" Length of str : " + str.length());
	            for (int i = 0; i < str.length(); i++) {
	                chrs = str.charAt(i); 
	               System.out.print(" i = " + i + " chrs = " + chrs);
		            if ((chrs==' ') | (chrs == '\n')) { 
		            		j++; 
						arg[j]="";
		            }
		            if ((Character.isDigit(chrs) | chrs == '-')) arg[j] = arg[j]+chrs;
		             System.out.println("arg["+j+"] = " + arg[j]);
		             
	            } // forloop
		    
		     for (int k=0;k<=j;k++) System.out.println("arg["+k+"] = " + arg[k]);
		    
			int numEquations = (int)((j+1)/3);
			System.out.println(" Number of Equations : " + numEquations);
			for(int i = 0;i<numEquations;i++) {
				double a= Double.parseDouble(arg[i*3]);
				double b = Double.parseDouble(arg[i*3+1]);
				double	c = Double.parseDouble(arg[i*3+2]);
				System.out.print("Equation # " + (i+1) +" : a = " + a);
				System.out.print(", b = " + b);
				System.out.print(", c = " + c);
				if (a == 0) {
					System.out.println(" Not a Quadratic Equation");
					continue;
				}
				descriminant = (b*b-4.0*a*c);
				if(descriminant >= 0) {
					 sqrt_descriminant = Math.sqrt(descriminant);
					 ans_pos = (-b+ sqrt_descriminant)/(2.0*a);
					 ans_neg = (-b- sqrt_descriminant)/(2.0*a);
					 System.out.println(" Roots : X1 = " + ans_pos + " & X2 = " + ans_neg);
				}
				else {
					System.out.print(" No real roots & the imaginary roots are:");
					descriminant_pos = descriminant * -1;
					sqrt_descriminant = Math.sqrt(descriminant_pos);
					System.out.print(" X1 = " + (-b)/(2*a) + "+ " + sqrt_descriminant/(2*a) +"i");
					System.out.println(" X2 = " + (-b)/(2*a) + "-" + sqrt_descriminant/(2*a) +"i");
				}
			}
			j=-1;
		    } // whileloop 
		    
	        in.close();
		}
		catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
}
