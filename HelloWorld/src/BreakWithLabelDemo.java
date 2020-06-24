public class BreakWithLabelDemo {
	public static void main(String[] args) {
		iloop:
			for(int i=0;i<2;i++) {
				System.out.println("i = " + i);
			jloop:		
				for (int j=0;j<3;j++) {
					System.out.print(" j = " + j);
					for (int k=0;k<4;k++) { 
						System.out.print(" k = " + k);
						// if (k > 2) break; // This will just break the k loop 
						// if (k > 2) break jloop; // This will break k and j loops
						 if (k > 2) break iloop; // This will break all k,j and i loops
					} //for k
					System.out.println();
				} //for j
			} // for i
	}
	
}
