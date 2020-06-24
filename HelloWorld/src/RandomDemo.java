
public class RandomDemo {
	    public static void main(String[] args) {
	        int SIDES = 6;
	        int a =  1 + (int) (Math.random() * SIDES);
	        int b =  1 + (int) (Math.random() * SIDES);
	        int sum = a + b;
	        System.out.println("Dice 1 : " + a + ", Dice 2  : " + b + ". So, total : " + sum);
	        System.out.println((double)(int) Math.pow(Double.parseDouble(args[0]),Double.parseDouble(args[1])));
	    }
	    
}
