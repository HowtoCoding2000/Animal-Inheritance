
public abstract class Animal
	{
		protected String name;
		protected String food;
		protected String noise;
		public abstract void bearsYoung();
		public void eats()
			{
				System.out.println(name + " eats " + food + ".");
			}
		public void makesNoise()
			{
				System.out.println(name + " says " + noise + ".");
			}
		
	}
