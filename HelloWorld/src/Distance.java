public class Distance {
    public static void main(String[] args) {

    		int x,y;
    	 
    		double dist;
   
        // parse x- and y-coordinates from command-line arguments
         x = Integer.parseInt(args[0]);
         y = Integer.parseInt(args[1]);

        // compute distance to (0, 0)
         dist = Math.sqrt(x*x + y*y);
 
        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
    }   
}