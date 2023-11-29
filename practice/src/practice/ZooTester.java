package practice;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Abdsaleh
 */
public class ZooTester
{
	public static void main(String []args)
	{
		ArrayList<Animal> arl = new ArrayList<>();
		
		arl.add(new Animal("teddy","cat",6));
		arl.add(new Animal("simon","tiger",10));
		arl.add(new Animal ("bear","bear",25));
		arl.add(new Animal("lion","lion",20));
		
		Zoo myZoo = new Zoo("jordan",201024,arl);
		
		System.out.println(myZoo);
		
		System.out.println(myZoo.age().getAge());
		
		
		
//		List<Talkable> a = new ArrayList<>();
	}
}
