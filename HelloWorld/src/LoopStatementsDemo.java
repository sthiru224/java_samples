
public class LoopStatementsDemo {
	public static void main(String[] args){
		
        int count = 1;
        int numberOfRepeats = Integer.parseInt(args[0]);
       
        System.out.println("1. While Loop Demo");
        count = 1;
        while (count <= numberOfRepeats) {
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println("2. DoWhile Loop Demo");
        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count <= numberOfRepeats);

 
        System.out.println("3. For Loop Demo");
        for(count=1;count<=numberOfRepeats;count++){
            System.out.println("Count is: " + count);
            
        }
        System.out.println("Count is: " + count);
        


        System.out.println("4. While Endless Loop and Break Demo");
        count = 1;
        while (true){
            if (count >= numberOfRepeats) break;
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println("5. While Endless Loop with Break and Continue Demo");
        count = 0;
        while (true){
        	 
           count++;
           if (count > numberOfRepeats) break;
           if (count%2 == 0) continue;
           System.out.println("Count is: " + count);
            
        }
  
        System.out.println("6. For Loop with a int range list Demo");        
        int[] numList =  {10,2,1,4,5};
        for (int x: numList) {
            System.out.println("Count is: " + x);
        }
 
        System.out.println("7. For Loop with a String range list Demo");        
        String [] strList ={"James", "Larry", "Swetha", "Lacy"};
        for( String y : strList ) {
        		System.out.println( y );
        }
        

      
    } //psvm
} //pc
