
public class Bat extends Mammal
	{
	public Bat(String n, String f, String o)
		{
			name = n;
			food = f;
			noise = o;
		}
	@Override
	public void makesNoise()
		{
			// TODO Auto-generated method stub
			System.out.println(name + " emmits a " + noise + ".");
		}
	}
