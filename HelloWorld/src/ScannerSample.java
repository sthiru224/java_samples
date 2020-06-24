import java.util.Scanner;
public class ScannerSample {
	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
	            System.out.print("Enter Item Code: ");
	            String itemCode = scanner.next();
	            System.out.print("Enter Price: ");
	            double price = scanner.nextDouble();
	            System.out.print("Enter Quantity: ");
	            int quantity = scanner.nextInt();
	            double total = price * quantity;
	            System.out.println();
 	            System.out.printf("%s", "|--------------------------------------|\n");
 	            System.out.printf("%s", "|         Swetha's Garments            |\n");
 	            System.out.printf("%s", "|--------------------------------------|\n");
 	            System.out.printf("| quantity | itemCode | price | total  |\n");
	            System.out.printf("%s", "|--------------------------------------|\n");
 	            System.out.printf("|    %d     | %s     | %4.2f | %6.2f |\n", quantity, itemCode, price, total);
 	            System.out.printf("%s", "|--------------------------------------|\n");
 	           scanner.close();
	        } catch (Exception e) {
	            e.printStackTrace(System.err);
	        }
	    }
}