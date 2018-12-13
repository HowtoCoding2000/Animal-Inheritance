
public class Cow extends Mammal
	{
		public Cow()
		{
			name = "Big Beef";
			food = "grass";
			noise = "Moo";
		}
		@Override
		public void eats()
			{
				// TODO Auto-generated method stub
				
			}
		@Override
		public void makesNoise()
			{
				// TODO Auto-generated method stub
				System.out.println(name + " says " + noise + ".");
			}
	}
