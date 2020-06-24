
public class quadraticEquation {
	
	public static void main(String[] args) {

			double a = Double.parseDouble(args[0]);
		    double b = Double.parseDouble(args[1]);
	        double c = Double.parseDouble(args[2]);
	        System.out.println("a = " + a + " b = " + b + " c = " + c);

	        // This program is incomplete since it does not check if the discriminant is positive
	        double discriminant = b*b - 4.0*a*c;
	        double sqroot =  Math.sqrt(discriminant);

	        double root1 = (-b + sqroot) / (2.0*a);
	        double root2 = (-b - sqroot) / (2.0*a);

	        System.out.println("x1 = " + root1);
	        System.out.println("x2 = " + root2);

	
	}

}
