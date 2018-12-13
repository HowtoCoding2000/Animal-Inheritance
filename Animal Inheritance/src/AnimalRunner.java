import java.util.ArrayList;
public class AnimalRunner
	{
		public static void main(String[] args)
			{
				ArrayList<Animal> animals = new ArrayList<Animal>();
				animals.add(new Cow ("Bertha", "grass", "moo"));
				animals.add(new Bat ("Fang", "bugs", "sonic pulse"));
				animals.add(new Robin ("Red", "worms", "tweet tweet"));
				animals.add(new Penguin ("Mumble", "fish", "squak"));
				for (Animal a : animals)
					{
						a.bearsYoung();
						a.eats();
						a.makesNoise();
					}
			}
	}
