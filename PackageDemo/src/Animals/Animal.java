package Animals;

	public abstract class Animal {
		private String name = null;
	
		public Animal(String name) {
			super();
			this.name = name;
		}
	
		public abstract boolean isWarmBlooded();
	
		public String toString() {
			return "Name is: " + name;
		}
	}

	interface Adoptable 
	{
		public boolean isAdoptable();
		public String getHomecareInstructions();
	 }

	interface Amphibian 
	{
		public boolean isAmphibian();
	 }
	interface Mammal 
	{
		public boolean isMammal();
	 }
	interface WaterLiveable 
	{
		public boolean isWaterLiveable();
		public boolean canLiveOnLand();
	 }
	interface WaterLiveableAdoptable extends WaterLiveable,Adoptable {
		public boolean isWaterLiveableAdoptable();

	}


	class Dog extends Animal implements Mammal,Adoptable{
		public Dog(String name) {
			super(name);
		}
		public boolean isAdoptable() {
			return true;
		}
		public String getHomecareInstructions() {
			return "is a Dog and its Home Care Instructions are listed here : http://www.aspca.org/pet-care/dog-care/general-dog-care";
		}
		public boolean isWarmBlooded(){
		   return true;
		}
		public boolean isMammal(){
		   return true;
		}
	}	
	class Frog extends Animal implements Amphibian,Adoptable{
			 
			public Frog(String name) {
				super(name);
			}

			public boolean isAdoptable() {
				return true;
			}

			public String getHomecareInstructions() {
				return " is a Frog and its Home Care Instructions are as listed for Frogs at https://www.lovethatpet.com/small-pets/frogs/";
			}

			public boolean isWarmBlooded(){
			   return false;
			}

			public boolean isAmphibian(){
				return true; 
			}
		}

	class Goldfish extends Animal implements WaterLiveableAdoptable{
			 
			public Goldfish(String name) {
				super(name);
			}

			public boolean isAdoptable() {
				return true;
			}

			public String getHomecareInstructions() {
				return " is a Goldfish : Home Care Instructions are as listed for Goldfish at http://www.wikihow.com/Take-Care-of-Goldfish ";
			}

			public boolean isWaterLiveable(){
				return true;
			} 

			public boolean isWaterLiveableAdoptable() {
				return true;
			}
			
			public boolean canLiveOnLand(){
				return false;
			} 

			public boolean isWarmBlooded(){
			   return false;
		   }

		}

	class Whale extends Animal implements WaterLiveable,Mammal{
			 
			public Whale(String name) {
				super(name);
			}
			public boolean isMammal() {
				return true;
			}
			public boolean isWaterLiveable(){
				return true;
			};
			public boolean canLiveOnLand(){
				return false;
			};
			public boolean isWarmBlooded(){
			   return true;
		   }

		}


 
