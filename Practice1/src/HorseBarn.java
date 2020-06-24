public class HorseBarn{

	private Horse[] spaces;
	
	public   int findHorseSpace(String hName) {
		// System.out.println(" spaces.length " + spaces.length);
		
		for (int i=0; i<spaces.length;i++) {
			// if(spaces[i] != null) System.out.println("i = " + i + " : " + spaces[i].getName());
		    if ((spaces[i]!= null) && (spaces[i].getName() == hName))
		    {
		        return(i);
		    }
		}
		return -1;
	}

public void consolidate() {
		{
		    int j = 0;
		    for(int i = 0; i < spaces.length; i++)
		    {
		      if(spaces[i] != null){
		        spaces[j] = spaces[i];
		        j++;
		      }
		    }
		    for(int i = j; i < spaces.length; i++)
		      spaces[i] = null;
		}
   }
	public static void main(String[] args) {
		
			HorseBarn sweetHome = new HorseBarn();		
		
			Horse[] horseArr = new Horse[10];	
			Horse myHorse;
			myHorse = new Horse(); myHorse.setName("Trigger"); myHorse.setWeight(1340); horseArr[0] = myHorse; horseArr[1] = null;
			myHorse = new Horse(); myHorse.setName("Silver");  myHorse.setWeight(1210); horseArr[2] = myHorse;
			myHorse = new Horse(); myHorse.setName("Lady");    myHorse.setWeight(1575); horseArr[3] = myHorse; horseArr[4] = null; 
			myHorse = new Horse(); myHorse.setName("Patches"); myHorse.setWeight(1350); horseArr[5] = myHorse;
			myHorse = new Horse(); myHorse.setName("Duke");    myHorse.setWeight(1410); horseArr[6] = myHorse;
			
			sweetHome.spaces = horseArr;
			
			for (int i=0; i<horseArr.length;i++) {
				if(horseArr[i]!=null) System.out.println("i = " + i + " : " + sweetHome.spaces[i].getName());
			}

			
			System.out.println(" Horse with Name Trigger is located in Index " + sweetHome.findHorseSpace("Trigger"));
			System.out.println(" Horse with Name Silver  is located in Index " +  sweetHome.findHorseSpace("Silver"));
			System.out.println(" Horse with Name Coco  is located in Index " + sweetHome.findHorseSpace("Coco"));
			sweetHome.consolidate();

			for (int i=0; i<horseArr.length;i++) {
				if(horseArr[i]!=null) System.out.println("i = " + i + " : " + sweetHome.spaces[i].getName());
			}

			System.out.println(" Horse with Name Trigger is located in Index " + sweetHome.findHorseSpace("Trigger"));
			System.out.println(" Horse with Name Silver  is located in Index " +  sweetHome.findHorseSpace("Silver"));
			System.out.println(" Horse with Name Coco  is located in Index " + sweetHome.findHorseSpace("Coco"));
	}
}
