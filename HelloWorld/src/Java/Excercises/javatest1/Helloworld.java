public class Helloworld{
	public static void main(String args[]){
		System.out.println("I am running my first Java program");
		for(int i=0; i<args.length; i++) {
				System.out.println("Argument " + i + " = " + args[i] );
		}
}

}