package prac;

import java.util.ArrayList;
/*
 * @author Abdsaleh
 */
public class Tester {
	public static void main(String []args)
	{
//		Friend abd = new Friend("Abd",25,"tennis");
//		
//		Friend ibrahim = new Friend("ibrahim",18,"golf");
//		Friend mo = new Friend("Mo",21,"football");
//		
//		Friend ahmad = new Friend("Ahmad",24,"basketball");
//		
//		
//		Friend []f = new Friend[3];
//		
//		f[0] = abd;
//		f[1] = ibrahim;
//		f[2] = mo;
//		
//		ibrahim.play(f);
//		
//		Insect s = new Insect("wasp");
//		System.out.println(s.toString());
//		
//		System.out.println(f[0].getHobby());
//		System.out.println(abd.chill());
//		
//		for (int i = 0; i < f.length; i++) {
//			System.out.println(f[i]);
//		}
		
		Telemarketer fritz = new Telemarketer("Fritz",25);
		
//		System.out.println(fritz);
		
		Mosquito m = new Mosquito("Aedes vexans");
		
		PeskyMosquito pm = new PeskyMosquito("Anopheles Walkeri");
//		
//		ColorList l = new ColorList();
//		l.addColor("yellow");
//		l.addColor("black");
//		l.addColor("blue");
//		
//		Butterfly b = new Butterfly("Swallowatail",l.getColorList());
//		
//		Butterfly b1 = new Butterfly(b);
//		
//		ArrayList<Insect> arr = new ArrayList<>();
//		
//		arr.add(m);
//		arr.add(pm);
//		arr.add(b);
//		arr.add(b1);
//		
//		for (int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		ArrayList<Nuisance> nuis = new ArrayList<>();
		
		nuis.add(m);
		nuis.add(pm);
		nuis.add(fritz);
		
		for (int i = 0; i < nuis.size(); i++) 
		{
			if (nuis.get(i) instanceof PeskyMosquito)
			{
				PeskyMosquito pmos = pm;
				System.out.println(pmos.bite());
			}
			
			if (nuis.get(i) instanceof Mosquito && !(nuis.get(i) instanceof PeskyMosquito))
			{
				Mosquito mos = m;
				System.out.println(mos.buzz());
			}
			System.out.println(nuis.get(i).annoy());
		}			
	}
}
