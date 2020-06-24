
public class Sound {

	/** the array of values in sound; guaranteed not to be null */

	private int[] samples;
	// Sound Part (a): limitAmplitude
	 public int limitAmplitude(int limit){
		 {
		 /* to be implemented in part (a) */ }
			/** Changes those values in this sound that have an amplitude greater than limit.
			* Values greater than limit are changed to limit.
			* Values less than -limit are changed to -limit.
			* @param limit the amplitude limit
			* Precondition: limit ≥ 0
			* @return the number of values in this sound that this method changed
			*/

		  int numChanges = 0;
		  for (int i = 0; i < samples.length; i++){
			   if (samples[i] > limit){
			    samples[i] = limit;
			    numChanges++;
			   }
			   else if (samples[i] < -limit){
			    samples[i] = -limit;
			    numChanges++;
			   }
		  }
		  return numChanges;
	 }

// Sound Part (b): trimSilenceFromBeginning
	public void trimSilenceFromBeginning()
	{
	  int leadingZeros = 0;
		 /** Removes all silence from the beginning of this sound.
		 * Silence is represented by a value of 0.
		 * Precondition: samples contains at least one nonzero value
		 * Postcondition: the length of samples reflects the removal of starting silence
		 */
	  // precondition guarantees at least 1 non-zero element
	  // so no need to check for out of bounds
	  
	  while(samples[leadingZeros] == 0) {
		  leadingZeros++;
	  }
	  
	  int[] withoutLeadingZeros = new int[samples.length - leadingZeros];
	  for(int i = leadingZeros; i < samples.length; i++) {
		  withoutLeadingZeros[i - leadingZeros] = samples[i];
	  }
	  samples = withoutLeadingZeros;
	}


	public static void main(String[] args) {
		Sound mySound = new Sound();
		int[] mySamples = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
		mySound.samples = mySamples ;
		System.out.println("Original List 1 :");
		for(int element: mySound.samples) System.out.print(" " + element);
		System.out.println();
		int numChanges = mySound.limitAmplitude(2000);
		System.out.println("Number of Changes : " + numChanges );
		System.out.println("List updated by limitAmplitude  :");
		for(int element: mySound.samples) System.out.print(" " + element);
		
		int[] mySamples2 = {0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0};
		mySound.samples = mySamples2 ;
		System.out.println();
		System.out.println("Original List 2 :");
		for(int element: mySound.samples) System.out.print(" " + element);
		mySound.trimSilenceFromBeginning();
		System.out.println();
		System.out.println("List updated by trimSilenceFromBeginning  :");
		for(int element: mySound.samples) System.out.print(" " + element);
		
	}
}
