
public class Bat extends Mammal
	{
	public Bat()
		{
			name = "Fang";
			food = "bugs";
			noise = "sonic pulse";
		}
	@Override
	public void makesNoise()
		{
			// TODO Auto-generated method stub
			System.out.println(name + "emmits a " + noise + ".");
		}
	}
